package myChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class writeThread extends Thread // �����忡�� ���
{
    Scanner sc = new Scanner(System.in);
    
    private Socket soc;// ����
    
    public writeThread(Socket so)
    {
        soc = so; // ���ο��� ������ ������, ����
    }
    
    @Override
    public void run()// �� �޼ҵ� �������̵�
    {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)); //�Է��� ���� ����
                
        PrintWriter writer = null; //�Է� �޽��� ��¿�
        // ���� �޽���
        try
        {
            writer = new PrintWriter(soc.getOutputStream(), true);
            //writer�� �Է� �޽����� ������ ���� ������ �������ش�
            System.out.print("���� �޽��� : ");
            String msg = br.readLine(); //msg�� ���۸� �о�ͼ� ����
            writer.println(msg); // ���� �޽��� ���
            
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                // TODO �ڵ� ������ catch ���
                e.printStackTrace();
            }// 10ms ������
        }
        catch (IOException e)
        {
            // TODO �ڵ� ������ catch ���
            e.printStackTrace();
        }
       
       
        
    }
}
