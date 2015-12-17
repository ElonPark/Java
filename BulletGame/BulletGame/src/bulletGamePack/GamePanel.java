package bulletGamePack;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GamePanel extends JPanel {
	TargetThread targetThread = null;

	ImageIcon baseImg = new ImageIcon("images/jet.png");
	ImageIcon bulletImg = new ImageIcon("images/bullet.png");
	JLabel baseLabel = new JLabel(baseImg);
	JLabel bulletLabel = new JLabel(bulletImg);
	JLabel targetLabel;

	final int gPanelWidth = 426;
	final int gPanelHeight = 439;
	int tagetSpeed = 5; // 적의 속도
	int bulletSpeed = 10; // 총알 속도 조절

	int tagNum = 0;// 타겟 숫자
	int hitTa = 0;// Hit 수
	int shot = 0;// 발사된 총알 수
	long hitPer = 0;// Hit율

	int rocaionX;// 랜덤 X

	int rocaionY;// 랜덤 Y

	JLabel Ltaget = new JLabel("  타겟 수: " + tagNum);
	JLabel Lpoint = new JLabel("  Hit 수: " + hitTa);
	JLabel LhitPerc = new JLabel("  명중률: " + hitPer);

	BulletGame BG = new BulletGame();

	public GamePanel() {
		setLayout(null);

		baseLabel.setSize(40, baseImg.getIconHeight());
		baseLabel.setOpaque(true);
		// baseLabel.setBackground(Color.BLACK);

		ImageIcon img = new ImageIcon("images/monster.png");
		targetLabel = new JLabel(img);
		targetLabel.setSize(img.getIconWidth(), img.getIconWidth());

		bulletLabel.setSize(10, 10);
		bulletLabel.setOpaque(true);
		// bulletLabel.setBackground(Color.RED);
		add(baseLabel);
		add(targetLabel);
		add(bulletLabel);
	}

	public void startGame() {

		int setWi = this.getWidth() / 2 - 20;
		int setHe = this.getHeight() - 50;
		baseLabel.setLocation(setWi, setHe);
		bulletLabel.setLocation(baseLabel.getX() + 15, baseLabel.getY());
		System.out.println("넓이 : " + GamePanel.this.getWidth());
		System.out.println("높이 : " + GamePanel.this.getHeight());

		targetLabel.setLocation(0, 0);

		targetThread = new TargetThread(targetLabel);
		targetThread.start();

		baseLabel.requestFocus();
		baseLabel.addKeyListener(new KeyAdapter() {

			BulletThread bulletThread = null;

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SPACE) { // 스페이스바 누르면 총알 발사 시작
					if (bulletThread == null || !bulletThread.isAlive()) {

						shot += 1;
						bulletThread = new BulletThread(bulletLabel, targetLabel, targetThread);
						bulletThread.start();

					}

				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 방향키 오른쪽 누르면
																	// 오른쪽으로
					baseLabel.setLocation(baseLabel.getX() + 5, setHe);
					bulletLabel.setLocation(baseLabel.getX() + 15, bulletLabel.getY());

					// System.out.println("위치 X : " + baseLabel.getX());
					// System.out.println("위치 Y : " + baseLabel.getY());

					if (baseLabel.getX() >= GamePanel.this.getWidth()) {// 오른쪽
																		// 화면을
																		// 넘어가면
																		// 왼쪽
																		// 화면에서
																		// 나옴

						baseLabel.setLocation(0, setHe);
						bulletLabel.setLocation(baseLabel.getX() + 15, baseLabel.getY());

					}

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {// 방향키 왼쪽 누르면
																// 왼쪽으로

					baseLabel.setLocation(baseLabel.getX() - 5, setHe);
					bulletLabel.setLocation(baseLabel.getX() + 15, bulletLabel.getY());
					// System.out.println("위치 X : " + baseLabel.getX());
					// System.out.println("위치 Y : " + baseLabel.getY());

					if (baseLabel.getX() <= 0) { // 왼쪽 화면을 넘어가면 오른쪽 화면에서 나옴
						baseLabel.setLocation(GamePanel.this.getWidth(), setHe);
						bulletLabel.setLocation(baseLabel.getX() + 15, baseLabel.getY());

					}
				}
			}
		});

	}

	class TargetThread extends Thread {
		JComponent target;

		public TargetThread(JComponent target) {
			this.target = target;

			target.setLocation(0, 0);// 타겟 위치 초기설정
			target.getParent().repaint();// 타겟 다시 그림

			tagNum = 1;
			Ltaget.setText("  타겟 수: " + tagNum);

		}

		public void run() {

			while (true) {

				// 적 위치
				rocaionX = (int) (Math.random() * 135);
				rocaionY = (int) (Math.random() * 140);

				int x = target.getX() + tagetSpeed; // 적 움직임 설정
				int y = target.getY();

				if (x > gPanelWidth || y < 0) {
					target.setLocation(rocaionX, rocaionY); // 현재 적 위치가 패널을
															// 넘어가면, 적 위치를 랜덤으로
					tagNum += 1;
					Ltaget.setText("  타겟 수: " + tagNum);

				} else {
					target.setLocation(x, y);
				}
				target.getParent().repaint();

				try {
					sleep(20);
				} catch (InterruptedException e) {
					// the case of hit by a bullet
					// 타겟이 총에 맞으면 새로 그리고 점수를 증가

					target.setLocation(rocaionX, rocaionY);
					target.getParent().repaint();
					tagNum += 1;
					Ltaget.setText("  타겟 수: " + tagNum);
					try {
						sleep(500); // 0.5초 기다린 후에 계속한다.
					} catch (InterruptedException e2) {
					}
				}
			}
		}

	}

	class BulletThread extends Thread { // 총알 발사 스레드
		JComponent bullet, target;
		Thread targetThread;

		public BulletThread(JComponent bullet, JComponent target, Thread targetThread) {
			this.bullet = bullet;
			this.target = target;
			this.targetThread = targetThread;
		}

		public void run() {
			while (true) {
				// 명중하였는지 확인
				if (hit()) {

					hitTa += 1; // 명중하면 점수 1점 증
					Lpoint.setText("  Hit수: " + hitTa);// 라벨에 입력
					hitPer = Math.round((hitTa * 100) / shot);// 명중률 계산
					LhitPerc.setText("  명중률: " + hitPer + "%"); // 라벨에 입력
					System.out.println(
							"발사: " + shot + " 타겟 수: " + tagNum + " Hit 수: " + hitTa + " Hit율: " + hitPer + "%");
					targetThread.interrupt(); // 타겟에 총알이 맞으면 총알 위치를 설정

					// bullet.setLocation(bullet.getParent().getWidth()/2 - 5,
					// bullet.getParent().getHeight()-50);

					bulletLabel.setLocation(baseLabel.getX() + 15, baseLabel.getY()); // 위치
																						// 초기화

					return;
				} else {
					int x = bullet.getX();
					int y = bullet.getY() - 5; // 총알 위치를 5씩 감소하여 위로 올린다.

					if (y < 0) {// 총알이 화면을 넘어가면 위치를 초기화한다.
						// bullet.setLocation(bullet.getParent().getWidth()/2 -
						// 5, bullet.getParent().getHeight()-50);
						bulletLabel.setLocation(baseLabel.getX() + 15, baseLabel.getY());

						bullet.getParent().repaint();

						return; // thread ends
					}
					bullet.setLocation(x, y);
					bullet.getParent().repaint();
				}
				try {

					sleep(bulletSpeed);
				} catch (InterruptedException e) {
				}
			}
		}

		private boolean hit() {
			// 4개의 조건중 하나라도 true이면 Hit된 것이므로 true를 리턴함
			if (targetContains(bullet.getX(), bullet.getY())
					|| targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY())
					|| targetContains(bullet.getX() + bullet.getWidth() - 1, bullet.getY() + bullet.getHeight() - 1)
					|| targetContains(bullet.getX(), bullet.getY() + bullet.getHeight() - 1)) {

				return true;
			} else {
				return false;
			}
		}

		private boolean targetContains(int x, int y) {
			// 총알위 x,y위치가 target의 범위안에 있으면 true를 return함
			if (((target.getX() <= x) && (target.getX() + target.getWidth() - 1 >= x))
					&& ((target.getY() <= y) && (target.getY() + target.getHeight() - 1 >= y))) {
				return true;
			} else
				return false;

		}
	}
}
