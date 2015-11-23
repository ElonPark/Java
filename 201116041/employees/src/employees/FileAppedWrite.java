package employees;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppedWrite
{
    SingletonClass st = SingletonClass.getInstance();
  
    void method(String s)
    {
            try {
                      
                            //추가 쓰기
                    
                    if(ChekFile.method(st.file))
                {
                            
                            FileWriter fileWriter = new FileWriter(st.file, true);
                            fileWriter.write("\r\n"+s);
                            fileWriter.close();
                }
                            
                    } catch (IOException e) {
                            System.out.println(e);
                    
                    }
    }
}
