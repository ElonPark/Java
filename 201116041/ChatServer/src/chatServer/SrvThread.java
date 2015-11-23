package chatServer;

import java.net.*;
import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SrvThread extends Thread
{

    private Socket soc;
    
    public SrvThread(Socket sc)
    {
            soc = sc;       
            System.out.println("연결 : " + soc.getInetAddress());             
    }

    @Override
    public void run() {
            BufferedReader reader = null;
            PrintWriter sendout = null;
            try{
                    
                    // recv
                    reader = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    String line = null;
                    while(true)
                    {
                            line = reader.readLine();
                            System.out.println("수신 메시지 : " + line);
                            if(line == null){
                                    break;
                            }                               
                            // send
                            sendout = new PrintWriter(soc.getOutputStream(), true);
                            sendout.println(line);
                            
                            Thread.sleep(10);
                    }                       
            }catch(IOException e)
            {
              //  System.out.println("예외1");     
                //    e.printStackTrace();
            }catch(InterruptedException e)
            {
                    e.printStackTrace();
            }finally{
                    try{
                            if(reader != null)
                                    reader.close();
                    //      if(sendout != null)
                    //              sendout.close();
                            if(soc != null){
                                    soc.close();
                            }                               
                    }catch(IOException ioex){
                            ioex.printStackTrace();
                    }
            }
    }
    
}
