package employees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataLoad
{
    SingletonClass st = SingletonClass.getInstance();
    void method(String[] DataArr)
    {
            try {
                    //File read
                    
                    //������ �о� �� �غ�
                    FileReader filereader = new FileReader(st.file);
                    
                    BufferedReader br = new BufferedReader(filereader);
                    
                    String str; //= br.readLine();
                    
                    int w =0;
                    while((str=br.readLine()) !=null)
                    {
                            DataArr[w] =str;
                   w++;
                    }
      filereader.close();
                            
                            
                    } catch (FileNotFoundException e) {
                            System.out.println(e);
                    
                    } catch (IOException e) {
                            System.out.println(e);
                    }
    }
}
