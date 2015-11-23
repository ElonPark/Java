package chatClient;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ChatClient
{
    
    public static void main(String[] args)
    {
        try
        {
            InetSocketAddress socketAddress = new InetSocketAddress(
                    "192.168.36.91", 9000);
                    
            Socket socket = new Socket();
            
            socket.connect(socketAddress, 10000);
            
            InetAddress inetaddr;
            if ((inetaddr = socket.getInetAddress()) != null)
            {
                System.out.println("연결: " + inetaddr);
            }
            else
            {
                System.out.println("연결실패: " + inetaddr);
            }
            
            new ReadThread(socket).start();
            while (true)
            {
                new writeThread(socket).run();
            }
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
