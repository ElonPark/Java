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
                
                // Thread ����
                new SrvThread(socket).start();
                
                ////////////////////////////////////////////////////////
                /*
                 * BufferedReader reader = new BufferedReader( new
                 * InputStreamReader(socket.getInputStream()));
                 * 
                 * String line = reader.readLine(); // ��Ŷ, ���ڿ��� �о ����
                 * 
                 * System.out.println("���� �޽���: " + line); reader.close();
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
