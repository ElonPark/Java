package chatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class writeThread extends Thread
{
    /*
     * private Socket soc;
     * 
     * Scanner sca = new Scanner(System.in);
     * 
     * public writeThread(Socket sc) { soc = sc; }
     * 
     * @Override public void run() { try { // ���� �޽��� System.out.print("���� �޽���: "
     * ); String msg = sca.next();
     * 
     * PrintWriter writer = new PrintWriter(soc.getOutputStream(), true);
     * writer.println(msg); // send
     * 
     * } catch (IOException e) { e.printStackTrace(); } finally { try { if (soc
     * != null) { soc.close(); } } catch (IOException ioex) {
     * ioex.printStackTrace(); } } } }
     */
    
    Scanner sc = new Scanner(System.in);
    
    private Socket soc;
    
    public writeThread(Socket so)
    {
        soc = so;
    }
    
    public void run()
    {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
                
        PrintWriter writer = null;
        try
        {
            // ���� �޽���
            writer = new PrintWriter(soc.getOutputStream(), true);
            System.out.print("���� �޽��� : ");
            String msg = br.readLine();// sc.next();
            
            writer.println(msg); // send
            
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                // TODO �ڵ� ������ catch ���
                e.printStackTrace();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
