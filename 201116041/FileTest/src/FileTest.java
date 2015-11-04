import java.io.*;
import java.util.Scanner;
public class FileTest {

	public static void main(String[] args) {
		/*
		//File file = new File("E:\\test.txt");
		File cdictory = new File("C:\\");
		
		
		//���丮 ��� Ȯ��
		//String filelist = cdictory.list();
		File[] filelist = cdictory.listFiles();
		for(int i= 0; i <filelist.length; i++)
		{
			if(filelist[i].isFile())
			System.out.println("file: "+filelist[i].getName());
			else if(filelist[i].isDirectory())
				System.out.println("Directory: "+filelist[i].getName());
		}
		
		File file = new File("test.txt");
		String path = file.getAbsolutePath();
		System.out.println("File: "+path);
		
		//file create
		File newFile = new File("E:\\newFile.txt");
		try {
			if(newFile.createNewFile())
			{
				System.out.println("������ �����Ǿ����ϴ�.");
			}else{
				System.out.println("������ ���� ���еǾ����ϴ�.");
			}
		} catch (IOException e) {
			System.out.println(e);
			
		}
		//dir create
		File newDir = new File("E:\\temp\\subDir");
		newDir.mkdirs();
		
		//���� Ȯ��
		File file = new File("E:/newfile.txt");
		if(file.exists())
		{
			System.out.println("������ �ֽ��ϴ�.");
		}else{
			System.out.println("������ �����ϴ�.");
		}
			
		
		
		
		//���� ����
		
		File file = new File("E:/newfile.txt");
		if(file.exists())
		{
			System.out.println("������ �ֽ��ϴ�.");
		    if(file.delete())
		    {
			}else{
			System.out.println("������ �����ϴ�.");
		    }
	    }else{
			
		}
	
		//���� ����
		File file = new File("E:/test.txt");
		if(file.canRead())
		{
			System.out.println("������ ���� �� �ֽ��ϴ�.");
		}
		if(file.canWrite())
		{
			System.out.println("������ ������ �� �ֽ��ϴ�.");
		}
		
		*/
		Scanner sc = new Scanner(System.in);
		//1.���丮 ����
		File newDir = new File("E:\\temp\\subDir");
		System.out.println("���: "+newDir);
		newDir.mkdirs();
		//2.���ϸ� �Է� 
		System.out.println("���� �̸��� �Է��ϼ���.");
		String f ="";
		f=sc.next();
		File File = new File("E:\\temp\\subDir\\"+f+".txt");
		//3.���� ����
		try {
			if(File.createNewFile())
			{
				System.out.println("������ �����Ǿ����ϴ�.");
			}else{
				System.out.println("������ ���� ���еǾ����ϴ�.");
			}
		} catch (IOException e) {
			System.out.println(e);
			
		}
		//4.���� ���� Ȯ��
		if(File.canRead())
		{
			System.out.println("������ ���� �� �ֽ��ϴ�.");
		}
		if(File.canWrite())
		{
			System.out.println("������ ������ �� �ֽ��ϴ�.");
		}
		
		//5.���� ����
		if(File.exists())
		{
			System.out.println("������ �����Ͻðڽ��ϱ�? : 1.Yes or 2.No");
			int conf = sc.nextInt();
			if(conf==1) {
				File.delete();
				System.out.println("���� �Ǿ����ϴ�.");
			}
			else if(conf==2){
				System.out.println("������ �ֽ��ϴ�.");
			}
		   
		}
		    else{
			System.out.println("������ �����ϴ�.");
		    }
		
		
		
		
		
		
		
	}

}
