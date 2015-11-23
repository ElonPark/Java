package chatServer;

import java.io.IOException;
import java.net.*;
import java.util.Vector;
import java.io.*;
import java.io.IOException;

public class ChatServer
{
    
    public static void main(String[] args)
    {
        try
        {
            int port = Integer.parseInt("9000");
            Vector<Socket> vec = new Vector<Socket>();
            ServerSocket srvSock = new ServerSocket(port);
            System.out.println("Waiting for connection");
            while (true)
            {
                
                Socket socket = null;
                socket = srvSock.accept();
                vec.add(socket);
                
                // Thread 생성
                new SrvThread(socket).start();
                
                ////////////////////////////////////////////////////////
                /*
                 * BufferedReader reader = new BufferedReader( new
                 * InputStreamReader(socket.getInputStream()));
                 * 
                 * String line = reader.readLine(); // 패킷, 문자열을 읽어서 저장
                 * 
                 * System.out.println("수신 메시지: " + line); reader.close();
                 * socket.close(); if(line.matches("end")){ srvSock.close(); }
                 */ ////////////////////////
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
