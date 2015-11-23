package GUIchat.Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class WriteThread
{
    
    Socket socket;
    
    ClientFrame cf;
    
    String str;
    
    String id;
    
    public WriteThread(ClientFrame cf)
    {
        this.socket = cf.socket;
        this.cf = cf;
    }
    
    public void sendMsg()
    {
        
        PrintWriter writer = null; // �Է� �޽��� ��¿�
        
        try
        {
            writer = new PrintWriter(socket.getOutputStream(), true);
            if (cf.isFirst == true) // IPClass Ȱ��ȭ
            {
                
                InetAddress iaddr = socket.getLocalAddress();
                String ip = iaddr.getHostAddress();
                getIP();
                System.out.println("ip: " + ip + "id: " + id);
                str= "[" + id + "] �� �α��� ("+ip+")";
            }
            else
            { // ClientFrame Ȱ��ȭ
                str = "[" + id + "]" + cf.txtF.getText();
            }
            writer.println(str);
            
        }
        catch (IOException e)
        {
            // TODO �ڵ� ������ catch ���
            e.printStackTrace();
        }
        
    }
    
    public void getIP()
    {
        id = IPClass.getIP();
    }
    
}
