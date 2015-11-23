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
            // 받은 메시지
            reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            // 소켓에서 메시지를 받아와 버퍼에 저장한다
            while (true)
            {
                String line = reader.readLine();// 버퍼의 내용을 line에 저장한다
                if (line == null) {
                    System.out.println("접속이 끊겼음");
                break;// 내용이 없으면 멈춤
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