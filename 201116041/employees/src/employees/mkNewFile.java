package employees;

import java.io.File;
import java.io.IOException;

public class mkNewFile
{
    SingletonClass st = SingletonClass.getInstance();
    void method(){
        //���ϸ� �Է� 
                      File File = new File("E:/employees.txt");
              //3.���� ����
                      try {
                      if(File.createNewFile())
                      {
                      System.out.println("������ �����Ǿ����ϴ�.\n");
                      }else{
                      System.out.println("������ ���� ���еǾ����ϴ�.");
                      }
                      } catch (IOException e) {
                      System.out.println(e);
                      }
                                      
              }
}
