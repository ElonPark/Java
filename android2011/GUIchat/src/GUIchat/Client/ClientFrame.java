package GUIchat.Client;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class ClientFrame extends JFrame implements ActionListener
{
    JTextArea txtA = new JTextArea();
    
    JTextField txtF = new JTextField(15);
    
    JButton btnTranfer = new JButton("전송");
    
    JButton btnExit = new JButton("닫기");
    
    JPanel p1 = new JPanel();
    
    boolean isFirst = true;
    
    WriteThread wt;
    
    Socket socket;
    
    public ClientFrame(Socket socket)
    {
        super("채팅");
        
        this.socket = socket;
        
        wt = new WriteThread(this);
        new IPClass(wt, this);
        
        add("Center", txtA);
        p1.add(txtF);
        p1.add(btnTranfer);
        p1.add(btnExit);
        
        add("South", p1);
        btnTranfer.addActionListener(this);
        btnExit.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300, 300, 350, 300);
        setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String id = IPClass.getIP();
        
        if(e.getSource() == btnTranfer)
        {
            if(txtF.getText().equals("")) return;
            
            txtA.append("["+id+"]" + txtF.getText()+ "\n");
            wt.sendMsg();
            txtF.setText("");
        }else if(e.getSource() == btnExit)
        {
            this.dispose();
        }
    }
    
}
