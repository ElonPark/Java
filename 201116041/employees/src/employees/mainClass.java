package employees;

import java.util.Scanner;

public class mainClass
{
    
    public static void main(String[] args)
    {
        SingletonClass st = SingletonClass.getInstance();
        insert inse = new insert();
        remove rm = new remove();
        updata upd = new updata();
        search ser = new search();
        print pri = new print();
        ReadData rd = new ReadData();
        FileLineCount flc = new FileLineCount();
        FileDataLoad fdl = new FileDataLoad();
        FileWrite fw = new FileWrite();
        String a="";
        int in = -1;
        while (true)
        {
           
            System.out.println("어떤 작업을 하시겠습니까?");
            System.out.print("1.입력 2.삭제 3.수정 4.검색 5.출력 6.저장데이터 확인\n: ");
            in = st.sc.nextInt();
            
            // 1~5
            switch (in)
            {
                
                case 1:
                    inse.method();
                    break;
                case 2:
                    rm.method();
                    break;
                case 3:
                    upd.method();
                    break;
                case 4:
                    ser.method();
                    break;
                case 5:
                    fw.method(a);
                    pri.method();
                    int lineNumber= flc.method();
                    String []strBuf = new String[lineNumber];
                    for(int i=0;i<strBuf.length; i++)
                    {
                        //String[] split = strBuf[i].split("_");
                        fdl.method(strBuf);
                    }
                  
                    break;
                case 6:
                    rd.mathod();
                    break;
                 
                   
            }
           
        }
        
    }
    
}
