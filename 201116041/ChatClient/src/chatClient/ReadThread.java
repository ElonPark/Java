package chatClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread
{
    /*
     * private Socket soc;
     * 
     * public ReadThread(Socket so) { soc = so; }
     * 
     * @Override public void run() { BufferedReader reader = null; try{ // 받은
     * 메시지 reader = new BufferedReader(new
     * InputStreamReader(soc.getInputStream())); while(true){ String line =
     * reader.readLine(); if(line == null) break; System.out.println();
     * System.out.println("받은 메시지 : " + line); } } catch (IOException e) {
     * e.printStackTrace(); } finally { try { if (soc != null) { soc.close(); }
     * } catch (IOException ioex) { ioex.printStackTrace(); } } } }
     */
    
    private Socket soc;
    
    public ReadThread(Socket so)
    {
        soc = so;
    }
    
    @Override
    public void run()
    {
        BufferedReader reader = null;
        try
        {
            // 받은 메시지
            reader = new BufferedReader(
                    new InputStreamReader(soc.getInputStream()));
            while (true)
            {
                String line = reader.readLine();
                if (line == null) break;
          
                System.out.println("받은 메시지 : " + line);
            }
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
