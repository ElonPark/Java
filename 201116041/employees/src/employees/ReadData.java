package employees;

public class ReadData
{SingletonClass st = SingletonClass.getInstance();
FileAppedWrite faw = new FileAppedWrite();
mkNewFile mk= new mkNewFile();
FileLineCount flc = new FileLineCount();
FileDataLoad fdl = new FileDataLoad();

    void mathod()
    {
        if(st.file.exists())
        {
                System.out.println("������ �ֽ��ϴ�.");
                 int lineNumber= flc.method();
                 String []strBuf = new String[lineNumber];
                 fdl.method(strBuf);
                for(int i=0;i<strBuf.length; i++)
                {
                    //String[] split = strBuf[i].split("_");
                        System.out.println(strBuf[i]);
                }
             
        }else{
                System.out.println("������ �����ϴ�.");
                System.out.println("���ο� ������ ����ϴ�.");
                mk.method();
        }
        
    }
}
