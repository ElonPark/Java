package awtSam03;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

public class mainClass extends JFrame {

	JLabel label;
	JTextField textf;

	public static void main(String[] args) {
		mainClass frame = new mainClass("≈∏¿Ã∆≤");
		frame.setVisible(true);
	}

	mainClass(String title) {
		setTitle(title);
		setBounds(100, 100, 200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textf = new JTextField(10);
		textf.setText("30");
	   
		JPanel p = new JPanel();
		JPanel motpan = new JPanel();
		JPanel botpan = new JPanel();

		
		JLabel label= new JLabel();
		label.setText(textf.getText());
		
		JButton btn1 = new JButton("+");
		btn1.addActionListener(new ActionListener() {
			 String a= textf.getText();
			public void actionPerformed(ActionEvent event) {
				
				label.setText(textf.getText());
		
				    int in = Integer.parseInt(a);
				in +=5;
				String st = String.valueOf(in);
						textf.setText(String.valueOf(st));
					

			}
		}

		);
      
		JButton btn2 = new JButton("-");
		btn2.addActionListener(
				
				new ActionListener() {
					String a= textf.getText();
			public void actionPerformed(ActionEvent event) {
				
				label.setText(textf.getText());
			
				 
				    int in = Integer.parseInt(a);
			   	in -= 5;
				String st = String.valueOf(in);
				textf.setText(String.valueOf(st));
				

			}
		}

		);


		JButton btn3 = new JButton("reset");
		btn2.addActionListener(
				new ActionListener() {
					 String a= textf.getText();
			public void actionPerformed(ActionEvent event) {
			
				label.setText(textf.getText());
				int h =0;
				
				    int in = Integer.parseInt(a);
				in =in * h;
				String st = String.valueOf(in);
				textf.setText(String.valueOf(st));
				
			}
		}

		);

		
		p.add(textf);
		p.add(label);
		motpan.add(btn1);
		motpan.add(btn2);
		botpan.add(btn3);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.NORTH);
		
		contentPane.add(motpan, BorderLayout.CENTER);
		contentPane.add(botpan, BorderLayout.SOUTH);
	}
}
