package myChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread
{

private Socket soc;
    
    public ReadThread(Socket so)
    {
        soc = so;
    }
    
    public void run()
    {
        BufferedReader reader = null; 
        try
        {
            // ���� �޽���
            reader = new BufferedReader(
                    new InputStreamReader(soc.getInputStream()));
            //���Ͽ��� �޽����� �޾ƿ� ���ۿ� �����Ѵ�
            while (true)
            {
                String line = reader.readLine();//������ ������ line�� �����Ѵ�
                if (line == null) break;//������ ������ ����
          
                System.out.println("\n���� �޽��� : " + line);//�޽����� ������ ����Ѵ�.
            }
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
