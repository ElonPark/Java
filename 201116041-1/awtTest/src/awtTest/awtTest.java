package awtTest;

import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

public class awtTest extends JApplet {

	@Override
	public void init() {
		System.out.println("init()");
		/*
		 * JFrame frm = new JFrame("타이틀"); frm.setBounds(0, 0, 400, 200);
		 * frm.setVisible(true);
		 * frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 */
		/*
		 * Icon icon = new ImageIcon("icon.jpg"); JButton button1 = new
		 * JButton("Button1", icon); JButton button2 = new JButton("Button2");
		 * 
		 * getContentPane().setLayout(new GridLayout(2,1));
		 * getContentPane().add(button1); getContentPane().add(button2);
		 */

		/*
		 * Container contentPane= getContentPane(); contentPane.setLayout(new
		 * FlowLayout());
		 * 
		 * JPanelEx opq = new JPanelEx(); JPanelEx tp = new JPanelEx();
		 * tp.setOpaque(false);
		 * 
		 * contentPane.add(opq ); contentPane.add(tp);
		 * 
		 * Icon icon = new ImageIcon("icon.jpg"); JLabel label = new
		 * JLabel("레이블",icon,SwingConstants.CENTER);
		 * 
		 * getContentPane().add(label);
		 * 
		 * 
		 * JTextField text = new JTextField("Hello World!"); text.setFont(new
		 * Font("Serif", Font.ITALIC, 40));
		 * 
		 * getContentPane().setLayout(new FlowLayout());
		 * getContentPane().add(text, BorderLayout.NORTH);
		 * 
		 * System.out.println("text= "+text.getText());
		 */

		// JTextArea
		myTextArea myTa= new myTextArea("타이틀");
		myTa.setVisible(true);

	}

	
	@Override
	public void start() {
		System.out.println("start()");
	}

	@Override
	public void stop() {
		System.out.println("stop()");
	}

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	class JPanelEx extends JPanel {
		public JPanelEx() {
			setBackground(Color.BLUE);

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawRect(1, 1, 98, 98);
			g.fillOval(20, 20, 60, 60);
		}

		public Dimension getPreferredSize() {
			return new Dimension(100, 100);
		}
	}

	class myTextArea extends JFrame {
		public myTextArea(String title) {

			
			setTitle(title);
			setBounds(100, 100, 300, 250);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel p = new JPanel();
			
			JTextArea area1 = new JTextArea("hello", 3,15);
			JTextArea area2 = new JTextArea("world", 2,20);
			JTextArea area3 = new JTextArea("City", 4,10);
			p.add(area1);
			p.add(area2);
			p.add(area3);
			
			Container contentPane = getContentPane();
			contentPane.add(p, BorderLayout.CENTER);
		}
	}

}