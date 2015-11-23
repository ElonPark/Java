
import java.io.*;

public class FileWriteTest {
	
	static void FileWrite(String filename,String writeStr)
	{
		try {
			File file = new File("E:/"+filename+".txt");
			    
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(writeStr);
			   
			
				fileWriter.close();
			} catch (IOException e) {
				System.out.println(e);
			
			}
	}
	static void FileAppedWrite(String filename,String appStr)
	{
		try {
			  
				//추가 쓰기
			File file = new File("E:/"+filename+".txt");
			if(chekBeforeWriteFile(file))
		    {
				
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write("\r\n"+appStr);
				fileWriter.close();
		    }
				
			} catch (IOException e) {
				System.out.println(e);
			
			}
	}
	
	public static boolean chekBeforeWriteFile(File file)
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

	public static void main(String[] args) {
		
		String filename = "writeTest";
		String myData = "1001-홍길동-24";
		String maData = "1002-일지매-21";
		FileWrite(filename,myData);
		FileAppedWrite(filename,maData);
		/*
		try {
		  /*  File file = new File("E:/writeTest.txt");
		    //if(checkBeforeWriteFile(file))
		    //{
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(myData);
		    //}
			
			//추가 쓰기
			File file = new File("E:/"+filename+".txt");
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("\r\n1002-일지매-21");
			
			fileWriter.close();
		} catch (IOException e) {
			System.out.println(e);
		
		}*/
		
		//

	}

}
