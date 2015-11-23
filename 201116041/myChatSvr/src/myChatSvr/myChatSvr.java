package myChatSvr;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class myChatSvr
{
    
    public static void main(String[] args)
    {
        Vector<Socket> vec = new Vector<Socket>(); // ���Ϳ� ���ʸ����� ����
        try
        {
            int port = Integer.parseInt("9000");// ��Ʈ ��ȣ�� �����ϰ� ��Ʈ�������� ����
            
            ServerSocket srvSock = new ServerSocket(port);// ���� ���Ͽ� ��Ʈ�� ����
            System.out.println("Waiting for connection");// ���� ���
            while (true)
            {
                
                Socket socket = null;
                socket = srvSock.accept();// ������ ��Ʈ�� ����
                vec.add(socket);// ���Ϳ� ������ ����
                
                // Thread ����
                new mChatSer(socket,vec).start();// ������ ����
                //���� ���� ���ϰ� vec�ȿ� ������ �����ϱ� ����
                //��� ���Ͽ� �����Ҷ��� vec�� �־��ָ� ��
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
