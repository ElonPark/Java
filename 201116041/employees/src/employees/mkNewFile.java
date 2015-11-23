package employees;

import java.io.File;
import java.io.IOException;

public class mkNewFile
{
    SingletonClass st = SingletonClass.getInstance();
    void method(){
        //파일명 입력 
                      File File = new File("E:/employees.txt");
              //3.파일 생성
                      try {
                      if(File.createNewFile())
                      {
                      System.out.println("파일이 생성되었습니다.\n");
                      }else{
                      System.out.println("파일이 생성 실패되었습니다.");
                      }
                      } catch (IOException e) {
                      System.out.println(e);
                      }
                                      
              }
}
