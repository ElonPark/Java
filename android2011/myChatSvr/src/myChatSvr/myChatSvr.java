package myChatSvr;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class myChatSvr
{
    
    public static void main(String[] args)
    {   
        
        Vector<Socket> vec = new Vector<Socket>(); // 벡터에 제너릭으로 소켓
        try
        {
            int port = Integer.parseInt("19999");// 포트 번호를 설정하고 스트링형으로 변경
            
            ServerSocket srvSock = new ServerSocket(port);// 서버 소켓에 포트를 저장
            System.out.println("Waiting for connection");// 연결 대기
          
            while (true)
            {
              
                
                Socket socket = null;
                socket = srvSock.accept();// 소켓을 포트와 연결
                vec.add(socket);// 벡터에 소켓을 저장
                
                // Thread 생성
				new mChatSer(socket, vec).start();// 스레드 시작
                //현재 받은 소켓과 vec안에 소켓을 구별하기 위해
                //모든 소켓에 전송할때는 vec만 넣어주면 됨
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
