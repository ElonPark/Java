package myChatSvr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class mChatSer extends Thread
{
    
    private Socket soc;
    
    private Vector<Socket> svec;
    
    public mChatSer(Socket sc, Vector<Socket> v)
    {
        soc = sc; // ����
        svec = v;
        System.out.println("���� : " + soc.getInetAddress()); // ����� ip�ּҸ� ���
    }
    
    @Override
    public void run()
    {
        BufferedReader reader = null;// ����
        PrintWriter sendout = null;// ���
        try
        {
            
            // recv
            reader = new BufferedReader(
                    new InputStreamReader(soc.getInputStream()));// ���ۿ� ���Ͽ� ������
                                                                 // ����
            String line = null;// ���ڿ� ���� line
            while (true)
            {
                line = reader.readLine();// ���۸� �о�ͼ� ����
                System.out.println("���� �޽��� : " + line);// ������ �����
                if (line == null) // ���ۿ� ������ ������ ����== ���� ����
                {
                    // vector ����
                    svec.remove(soc);
                    break;
                }
                // send
                // �ڱ� �ڽ��� ������ ������ �ٸ� ���Ͽ� ����
                // for,while�� ���
                
                for (int i = 0; i < svec.size(); i++)
                // for (Socket s : svec)
                {
                    if (svec.get(i) != soc)
                    { // ���� ���ϰ� ���Ϳ� ������ �ٸ���
                        // if (s != soc)
                        {
                            // sendout = new PrintWriter(s.getOutputStream(),
                            // true);
                            sendout = new PrintWriter(
                                    svec.get(i).getOutputStream(), true);// ���Ϳ�
                                                                         // �޾ƿ�
                                                                         // ������
                                                                         // ������
                            sendout.println(line); // ���۳��� ���
                            sendout.flush();
                        }
                        Thread.sleep(10); // ������ 10ms������
                        
                    }
                }
            }
        }
        catch (
        
        IOException e)
        
        {
            // System.out.println("����1");
            // e.printStackTrace();
        }
        catch (
        
        InterruptedException e)
        
        {
            e.printStackTrace();
        }
        finally
        
        {
            try
            {
                if (reader != null) reader.close();// ���ۿ� ������ ������ ���� ����
                if (soc != null) // ���Ͽ� ������ ������ ���� ����
                {
                    soc.close();
                }
            }
            catch (IOException ioex)
            {
                ioex.printStackTrace();
            }
        }
    }
    
}
