package employees;

public class WriteData
{SingletonClass st = SingletonClass.getInstance();
FileAppedWrite faw = new FileAppedWrite();
mkNewFile mk= new mkNewFile();
 void method(String s){

     if(ChekFile.method(st.file))
     {
             
             faw.method(s);
     }else{
             System.out.println("������ �����ϴ�.");
             System.out.println("���ο� ������ ����ϴ�.");
             mk.method();
             faw.method(s);
             
     }
 }
}
