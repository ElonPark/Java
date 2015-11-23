package GUIchat.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread
{
    
    Socket socket;
    
    ClientFrame cf;
    
    ReadThread(Socket socket, ClientFrame cf)
    {
        this.socket = socket;
        this.cf = cf;
    }
    
    @Override
    public void run()
    {
        BufferedReader reader = null;
        try
        {
            // ���� �޽���
            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            // ���Ͽ��� �޽����� �޾ƿ� ���ۿ� �����Ѵ�
            while (true)
            {
                String line = reader.readLine();// ������ ������ line�� �����Ѵ�
                if (line == null) {
                    System.out.println("������ ������");
                break;// ������ ������ ����
                }
                cf.txtA.append(line+"\n");
            }
            
        }
        catch (IOException e)
        {
           // e.printStackTrace();
        }
    }
}