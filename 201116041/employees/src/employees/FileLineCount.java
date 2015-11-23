package employees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLineCount
{
    SingletonClass st = SingletonClass.getInstance();
   
    int method()
    {
            int w =0;
            try {
                    
                    //파일을 읽어 올 준비
                    FileReader filereader = new FileReader(st.file);
                    
                    BufferedReader br = new BufferedReader(filereader);
                    while((br.readLine()) !=null)
                    {
                   w++;
                    }
                            filereader.close();
                            
                            
                    } catch (FileNotFoundException e) {
                            System.out.println(e);
                    
                    } catch (IOException e) {
                            System.out.println(e);
                    }
            
                            
            return w;
    }
}
