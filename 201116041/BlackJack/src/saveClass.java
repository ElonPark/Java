import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class saveClass {

  static File file = new File("E:/BlackJack.txt");
    static boolean chekBeforeWriteFile(File file)
	{
		if(file.exists())
		{
			if(file.isFile() && file.canWrite())
			{
				return true;
			}
		}
		return false;
	}
    static int FileLineCount()
	{
		int w =0;
		try {
			
			//������ �о� �� �غ�
			FileReader filereader = new FileReader(file);
			
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
    
    void FileDataLoad(String[] DataArr)
	{
		try {
			//File read
			
			//������ �о� �� �غ�
			FileReader filereader = new FileReader(file);
			
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
    
    static void FileAppedWrite(String name,String appStr)
	{
		try {
			  
				//�߰� ����
			
			if(chekBeforeWriteFile(file))
		    {
				
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write("\r\n"+name+"���� Ĩ�� "+appStr+"�� �Դϴ� ");
				fileWriter.close();
		    }
				
			} catch (IOException e) {
				System.out.println(e);
			
			}
	}
    static void mkNewFile(){
	  //���ϸ� �Է� 
			File File = new File("E:/BlackJack.txt");
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
    
    void writeData(String name,String appStr)
    {
	
	if(chekBeforeWriteFile(file))
	{
		
		FileAppedWrite(name,appStr);
	}else{
		System.out.println("������ �����ϴ�.");
		System.out.println("���ο� ������ ����ϴ�.");
		mkNewFile();
		FileAppedWrite(name,appStr);
		
	}
	
    }
    void readData()
    {
	
	if(file.exists())
	{
		System.out.println("������ �ֽ��ϴ�.");
		 int lineNumber= FileLineCount();
		 String []strBuf = new String[lineNumber];
		 FileDataLoad(strBuf);
		for(int i=0;i<strBuf.length; i++)
		{
			System.out.println(strBuf[i]);
		}
	}else{
		System.out.println("������ �����ϴ�.");
		System.out.println("���ο� ������ ����ϴ�.");
		mkNewFile();
	}
	
    }
}
