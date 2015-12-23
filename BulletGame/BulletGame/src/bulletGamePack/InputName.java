package bulletGamePack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InputName extends JFrame implements ActionListener {

	// 게임을 시작할때 창을 뜨워 유저의 이름을 받아온다.
	JLabel jLal = new JLabel("이름을 입력하세요 ");
	JTextField txtF = new JTextField(15);
	String name;

	JButton btnExit = new JButton("게임 시작");

	JPanel p1 = new JPanel();

	void Input() {
		txtF.setText("용사 AAA");  //기본 이름 설정
		//패널에 라벨, 텍스트필드 ,버튼 추가
		p1.add(jLal);  
		p1.add(txtF);

		p1.add(btnExit);

		add("Center", p1);

		btnExit.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 120);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnExit) {
			// 닫기 버튼을 누르면 라벨에 유저이름을 입력하고 게임을 구성한다.
			BulletGame bg = new BulletGame();
			bg.LUser.setText("  유저: " + txtF.getText());
			bg.gameFrame();
			this.dispose();
		}

	}
}
