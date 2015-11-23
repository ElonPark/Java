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
             System.out.println("파일이 없습니다.");
             System.out.println("새로운 파일을 만듭니다.");
             mk.method();
             faw.method(s);
             
     }
 }
}
