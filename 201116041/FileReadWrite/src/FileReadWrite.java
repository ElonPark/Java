import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
	
	static int FileLineCount(String filename)
	{
		int w =0;
		try {
			//File read
			File file = new File("E:/"+filename+".txt");
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
	static void FileDataLoad(String filename,String[] DataArr)
	{
		try {
			//File read
			File file = new File("E:/"+filename+".txt");
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

	public static void main(String[] args) {
		/*
		String filename = "test";
		try {
		//File read
		File file = new File("E:/"+filename+".txt");
		if(file.exists()==false || file.canRead() == false) //������ ���ų� ���� ������ ������
		{
			System.out.println(filename+" ������ �����ϴ�.");
			return;
		}
		//������ �о� �� �غ�
		
			FileReader filereader = new FileReader(file);
			int ch = filereader.read();
			while( (ch = filereader.read())!= -1)//-1 == End Of File =EOF
			{
			System.out.println((char)ch);
			
			
			}
			filereader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		
		} catch (IOException e) {
			System.out.println(e);
		}
		
		*/
		
		
	

		//�� ���徿 �о� ���δ�.
		/*
		String filename = "test";
		try {
		//File read
		File file = new File("E:/"+filename+".txt");
		//������ �о� �� �غ�
		FileReader filereader = new FileReader(file);
		
		BufferedReader br = new BufferedReader(filereader);
		
	    String str; //= br.readLine();
		String strBuf[] = new String[10];
		int w =0;
		while((str=br.readLine()) !=null)
		{
		   strBuf[w] =str;
	       w++;
		}
		
			filereader.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		
		} catch (IOException e) {
			System.out.println(e);
		}
		*/
		
		int lineNumber= FileLineCount("test");
		String []strBuf = new String[lineNumber];
		
		 FileDataLoad("test",strBuf);
		//���
		for(int i=0;i<strBuf.length; i++)
		{
			System.out.println(strBuf[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
