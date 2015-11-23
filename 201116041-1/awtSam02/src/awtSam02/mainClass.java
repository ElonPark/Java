package awtSam02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;


public class mainClass extends JFrame {

	JTextArea area;
	JTextField textf;

	public static void main(String[] args) {
		mainClass frame = new mainClass("타이틀");
		frame.setVisible(true);
	}

	mainClass(String title) {
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		area = new JTextArea();
		area.setLineWrap(true);

		JScrollPane scrollpane = new JScrollPane(area);
		scrollpane.setPreferredSize(new Dimension(200, 120));

		p.add(scrollpane);
		JPanel botpan = new JPanel();
		textf = new JTextField(10);
		JButton btn1 = new JButton("끝에 추가");

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				area.append(textf.getText());

			}
		}

		);

		JButton btn2 = new JButton("앞에 추가");
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				try {

					area.insert(textf.getText(), area.getLineStartOffset(0));

				} catch (BadLocationException e) {
					System.out.println("BadLocation 에러");
				}
			}
		}

		);

		botpan.add(textf);
		botpan.add(btn1);
		botpan.add(btn2);

		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
		contentPane.add(botpan, BorderLayout.SOUTH);
	}

}
