package myChatSvr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;

public class mChatSer extends Thread
{
    
    private Socket soc;
    
    private Vector<Socket> svec;
    
    public mChatSer(Socket sc, Vector<Socket> v)
    {
        soc = sc; // 세터
        svec = v;
        System.out.println("연결 : " + soc.getInetAddress()); // 연결된 ip주소를 출력
    }
    
    @Override
    public void run()
    {
        BufferedReader reader = null;// 버퍼
        PrintWriter sendout = null;// 출력
        try
        {
            
            // recv
            reader = new BufferedReader(
                    new InputStreamReader(soc.getInputStream()));// 버퍼에 소켓에 내용을
                                                                 // 저장
            String line = null;// 문자열 변수 line
            while (true)
            {
                line = reader.readLine();// 버퍼를 읽어와서 저장
                System.out.println("수신 메시지 : " + line);// 내용을 출력함
                if (line == null) // 버퍼에 내용이 없으면 멈춤== 접속 끊김
                {
                    // vector 삭제
                    svec.remove(soc);
                    break;
                }
                // send
                // 자기 자신의 소켓을 제외한 다른 소켓에 전송
                // for,while을 사용
                
                for (int i = 0; i < svec.size(); i++)
                // for (Socket s : svec)
                {
                    if (svec.get(i) != soc)
                    { // 현재 소켓과 벡터에 소켓이 다를때
                        // if (s != soc)
                        {
                            // sendout = new PrintWriter(s.getOutputStream(),
                            // true);
                            sendout = new PrintWriter(
                                    svec.get(i).getOutputStream(), true);// 벡터에
                                                                         // 받아온
                                                                         // 내용을
                                                                         // 내보냄
                            sendout.println(line); // 버퍼내용 출력
                            sendout.flush();
                        }
                        Thread.sleep(10); // 스레드 10ms딜레이
                        
                    }
                }
            }
        }
        catch (
        
        IOException e)
        
        {
            // System.out.println("예외1");
            // e.printStackTrace();
        }
        catch (
        
        InterruptedException e)
        
        {
            e.printStackTrace();
        }
        finally
        
        {
            try
            {
                if (reader != null) reader.close();// 버퍼에 내용이 있으면 리더 닫음
                if (soc != null) // 소켓에 내용이 있으면 소켓 닫음
                {
                    soc.close();
                }
            }
            catch (IOException ioex)
            {
                ioex.printStackTrace();
            }
        }
    }
    
}