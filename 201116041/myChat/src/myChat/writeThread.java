package myChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class writeThread extends Thread // 쓰레드에서 상속
{
    Scanner sc = new Scanner(System.in);
    
    private Socket soc;// 소켓
    
    public writeThread(Socket so)
    {
        soc = so; // 메인에서 소켓을 가져옴, 세터
    }
    
    @Override
    public void run()// 런 메소드 오버라이드
    {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)); //입력을 위한 버퍼
                
        PrintWriter writer = null; //입력 메시지 출력용
        // 보낼 메시지
        try
        {
            writer = new PrintWriter(soc.getOutputStream(), true);
            //writer는 입력 메시지를 소켓을 통해 서버에 전송해준다
            System.out.print("보낼 메시지 : ");
            String msg = br.readLine(); //msg는 버퍼를 읽어와서 저장
            writer.println(msg); // 전송 메시지 출력
            
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                // TODO 자동 생성된 catch 블록
                e.printStackTrace();
            }// 10ms 딜레이
        }
        catch (IOException e)
        {
            // TODO 자동 생성된 catch 블록
            e.printStackTrace();
        }
       
       
        
    }
}
