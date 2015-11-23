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
			
			//파일을 읽어 올 준비
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
			
			//파일을 읽어 올 준비
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
			  
				//추가 쓰기
			
			if(chekBeforeWriteFile(file))
		    {
				
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write("\r\n"+name+"님의 칩은 "+appStr+"개 입니다 ");
				fileWriter.close();
		    }
				
			} catch (IOException e) {
				System.out.println(e);
			
			}
	}
    static void mkNewFile(){
	  //파일명 입력 
			File File = new File("E:/BlackJack.txt");
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
    
    void writeData(String name,String appStr)
    {
	
	if(chekBeforeWriteFile(file))
	{
		
		FileAppedWrite(name,appStr);
	}else{
		System.out.println("파일이 없습니다.");
		System.out.println("새로운 파일을 만듭니다.");
		mkNewFile();
		FileAppedWrite(name,appStr);
		
	}
	
    }
    void readData()
    {
	
	if(file.exists())
	{
		System.out.println("파일이 있습니다.");
		 int lineNumber= FileLineCount();
		 String []strBuf = new String[lineNumber];
		 FileDataLoad(strBuf);
		for(int i=0;i<strBuf.length; i++)
		{
			System.out.println(strBuf[i]);
		}
	}else{
		System.out.println("파일이 없습니다.");
		System.out.println("새로운 파일을 만듭니다.");
		mkNewFile();
	}
	
    }
}
