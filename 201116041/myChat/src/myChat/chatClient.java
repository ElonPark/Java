package myChat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;


public class chatClient
{
    
    public static void main(String[] args)
    {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",
                9000); // ������ ���� IP�� ��Ʈ ��ȣ�� �Է��Ͽ� �����ּ� �Է�.
                
        Socket socket = new Socket();// ����
        
        try
        {
            socket.connect(socketAddress, 10000);
            // �����ּҸ� �����ͼ� �ּҿ� �����ϰ� 10000ms ���� ������ ������ �������
            
            InetAddress inetaddr;//����� IP�� �˷��ֱ� ����
            if ((inetaddr = socket.getInetAddress()) != null)
                //���Ͽ��� ������ ip�� �����ip�� ������
            {
                System.out.println("����: " + inetaddr);
            }
            else
            {
                System.out.println("�������: " + inetaddr);
            }
            
            new ReadThread(socket).start(); //�޽��� �޴� ������
            while (true)
            {
                new writeThread(socket).run();//�޽��� ������ ������
            }
        }
        catch (IOException e)
        {
            
            
            // TODO �ڵ� ������ catch ���
            e.printStackTrace();
        }
        
        
    }
    
}
