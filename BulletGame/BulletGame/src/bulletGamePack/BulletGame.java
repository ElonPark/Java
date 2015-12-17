package bulletGamePack;

/*--------------------------------------------
 * 프로그램명 : 사격 게임
 * 개발자       : 박성운
 * 개발기간    : 2015/12/04 ~ 2015/12/18
 * 사용방법    : 이클립스
 --------------------------------------------*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BulletGame extends JFrame {
	

	JLabel lStatusBar = new JLabel("게임을 시작합니다..");
	JPanel pPointBoard = new JPanel(new GridLayout(0, 1));
	JLabel LUser = new JLabel();
	JLabel lLevel = new JLabel("      레벨");
	
	String[] sLevel = { "1단계", "2단계", "3단계" }; // Level 설정 콤보박스의 아이템
	
		
	JComboBox combo = new JComboBox(sLevel); // Level 설정 콤보박스 생성
	
/*
	// 이 게임의 생성자로서 게임을 시작한다...
	public BulletGame() {
		InputName nameInput = new InputName();
		User = new JLabel("유저 이름: "+nameInput.txtF.getText());	
		
	}
*/
	void gameFrame(){
		GamePanel pGame = new GamePanel();
		
		setTitle("우리조 자바기말프로젝트 : 사격 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(1, 1));
		
        createMenu();
		// 콤보박스에 Action 리스너 등록. 선택된 아이템의 이미지 출력
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource(); // Action 이벤트가 발생한
															// 콤보박스 알아내기
				int index = cb.getSelectedIndex(); // 콤보박스의 선택된 레벨의 인덱스 번호 알아내기
				lStatusBar.setText(sLevel[index]); // 레벨명을 StatusBar에 출력
				
				//난이도 설정
				//타겟의 속도와 총알의 속도를 조절한다. 
				if(	cb.getSelectedIndex() == 0)
				{
					pGame.tagetSpeed = 5;
					pGame.bulletSpeed = 5;
					pGame.baseLabel.grabFocus();
					
				}
				else if(cb.getSelectedIndex() == 1)
				{
					pGame.tagetSpeed = 10;
					pGame.bulletSpeed = 10;
					pGame.baseLabel.grabFocus();
				}
				else if(cb.getSelectedIndex() == 2)
				{
					pGame.tagetSpeed = 20;
					pGame.bulletSpeed = 20;
					pGame.baseLabel.grabFocus();
				}
			}
		});
		
		pPointBoard.add(lLevel);
		pPointBoard.add(combo);
		pPointBoard.add(LUser);
		pPointBoard.add(pGame.Ltaget);
		pPointBoard.add(pGame.Lpoint);
		pPointBoard.add(pGame.LhitPerc);
		pPointBoard.setBackground(Color.white);
		
		
		lStatusBar.setForeground(Color.GREEN);

		add(pPointBoard, BorderLayout.WEST);
		add(pGame, BorderLayout.CENTER);
		add(lStatusBar, BorderLayout.SOUTH);

		setSize(600, 400);
		setResizable(false);
		setVisible(true);

		
		// 화면에 모두 그려지면, 즉 컨텐트팬을 구성하는 모든 컴포넌트들의 위치와 크기가 결정된 후
		// 게임을 시작하게 한다.
		pGame.startGame();
	}
	
	
	// 메뉴를 만들어 프레임에 삽입한다.
	void createMenu() {
		JMenuBar mb = new JMenuBar(); // 메뉴바 생성

		JMenu fileMenu = new JMenu("File"); // File 메뉴 생성
		JMenu runMenu = new JMenu("Run"); // Run 메뉴 생성
		
		JMenu viewMenu = new JMenu("View"); // View 메뉴 생성
		JMenu helpMenu = new JMenu("Help"); // View 메뉴 생성

		// File 메뉴에 메뉴아이템 생성 삽입
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.add(new JMenuItem("Close"));
		fileMenu.addSeparator(); // 분리선 삽입
		fileMenu.add(new JMenuItem("Exit"));

		// Run 메뉴에 메뉴아이템 생성 삽입
		runMenu.add(new JMenuItem("New Player"));
		runMenu.add(new JMenuItem("Level Setup"));
	

		// View 메뉴에 메뉴아이템 생성 삽입
		viewMenu.add(new JMenuItem("상태바 보이기"));
		viewMenu.add(new JMenuItem("배경 변경하기"));

		// Help 메뉴에 조원소개하기 메뉴아이템 생성 삽입
		helpMenu.add(new JMenuItem("조원 소개하기"));

		// 메뉴바에 메뉴 삽입
		mb.add(fileMenu); // File 메뉴 삽입
		mb.add(runMenu); // Run 메뉴 삽입
		mb.add(viewMenu); // View 메뉴 삽입
		mb.add(helpMenu); // View 메뉴 삽입

		// 메뉴바를 프레임에 부착
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		
		InputName ipn = new InputName();
		ipn.Input();
		
	}

}




