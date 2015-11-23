package myChat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;


public class chatClient
{
    
    public static void main(String[] args)
    {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",
                9000); // 연결할 곳의 IP와 포트 번호를 입력하여 소켓주소 입력.
                
        Socket socket = new Socket();// 소켓
        
        try
        {
            socket.connect(socketAddress, 10000);
            // 소켓주소를 가져와서 주소에 연결하고 10000ms 동안 연결이 없으면 연결안함
            
            InetAddress inetaddr;//연결된 IP를 알려주기 위함
            if ((inetaddr = socket.getInetAddress()) != null)
                //소켓에서 가져온 ip와 연결된ip가 같으면
            {
                System.out.println("연결: " + inetaddr);
            }
            else
            {
                System.out.println("연결실패: " + inetaddr);
            }
            
            new ReadThread(socket).start(); //메시지 받는 스레드
            while (true)
            {
                new writeThread(socket).run();//메시지 보내는 스레드
            }
        }
        catch (IOException e)
        {
            
            
            // TODO 자동 생성된 catch 블록
            e.printStackTrace();
        }
        
        
    }
    
}
