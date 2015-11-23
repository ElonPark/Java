package employees;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite
{
    SingletonClass st = SingletonClass.getInstance();
    
    void method(String writeStr)
    {
        try
        {
            
            FileWriter fileWriter = new FileWriter(st.file);
            fileWriter.write(writeStr);
            
            fileWriter.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
            
        }
    }
}
