package awtSam01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainClass extends JFrame implements ActionListener {

	JTextField textf1;
	JTextField textf2;
	JLabel label;

	public static void main(String args[])
	{
		
		mainClass frame = new mainClass("Ÿ��Ʋ");
		frame.setVisible(true);
		
	}
	mainClass(String title)
	{
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		textf1 = new JTextField("�ּ�1",20);
		textf2 = new JTextField("�ּ�2",20);
		
		JButton button = new JButton("���");
		button.addActionListener(this);
		
		label = new JLabel();
		p.add(textf1);
		p.add(textf2);
		p.add(button);
		
		
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
		contentPane.add(label,BorderLayout.SOUTH);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		label.setText(textf1.getText()+" "+ textf2.getText());
	}
}
