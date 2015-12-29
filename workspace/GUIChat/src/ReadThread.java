import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread
{

private Socket soc;
    
    public ReadThread(Socket so)
    {
        soc = so;
    }
    
    public void run()
    {
        BufferedReader reader = null; 
        try
        {
            // 받은 메시지
            reader = new BufferedReader(
                    new InputStreamReader(soc.getInputStream()));
            //소켓에서 메시지를 받아와 버퍼에 저장한다
            while (true)
            {
                String line = reader.readLine();//버퍼의 내용을 line에 저장한다
                if (line == null) break;//내용이 없으면 멈춤
          
                System.out.println("\n받은 메시지 : " + line);//메시지가 있으면 출력한다.
            }
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}