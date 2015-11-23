import java.io.*;
import java.util.Scanner;
public class FileTest {

	public static void main(String[] args) {
		/*
		//File file = new File("E:\\test.txt");
		File cdictory = new File("C:\\");
		
		
		//디렉토리 목록 확인
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
				System.out.println("파일이 생성되었습니다.");
			}else{
				System.out.println("파일이 생성 실패되었습니다.");
			}
		} catch (IOException e) {
			System.out.println(e);
			
		}
		//dir create
		File newDir = new File("E:\\temp\\subDir");
		newDir.mkdirs();
		
		//파일 확인
		File file = new File("E:/newfile.txt");
		if(file.exists())
		{
			System.out.println("파일이 있습니다.");
		}else{
			System.out.println("파일이 없습니다.");
		}
			
		
		
		
		//파일 삭제
		
		File file = new File("E:/newfile.txt");
		if(file.exists())
		{
			System.out.println("파일이 있습니다.");
		    if(file.delete())
		    {
			}else{
			System.out.println("파일이 없습니다.");
		    }
	    }else{
			
		}
	
		//파일 권한
		File file = new File("E:/test.txt");
		if(file.canRead())
		{
			System.out.println("파일을 읽을 수 있습니다.");
		}
		if(file.canWrite())
		{
			System.out.println("파일을 기입할 수 있습니다.");
		}
		
		*/
		Scanner sc = new Scanner(System.in);
		//1.디렉토리 생성
		File newDir = new File("E:\\temp\\subDir");
		System.out.println("경로: "+newDir);
		newDir.mkdirs();
		//2.파일명 입력 
		System.out.println("파일 이름을 입력하세요.");
		String f ="";
		f=sc.next();
		File File = new File("E:\\temp\\subDir\\"+f+".txt");
		//3.파일 생성
		try {
			if(File.createNewFile())
			{
				System.out.println("파일이 생성되었습니다.");
			}else{
				System.out.println("파일이 생성 실패되었습니다.");
			}
		} catch (IOException e) {
			System.out.println(e);
			
		}
		//4.파일 권한 확인
		if(File.canRead())
		{
			System.out.println("파일을 읽을 수 있습니다.");
		}
		if(File.canWrite())
		{
			System.out.println("파일을 기입할 수 있습니다.");
		}
		
		//5.파일 삭제
		if(File.exists())
		{
			System.out.println("파일을 삭제하시겠습니까? : 1.Yes or 2.No");
			int conf = sc.nextInt();
			if(conf==1) {
				File.delete();
				System.out.println("삭제 되었습니다.");
			}
			else if(conf==2){
				System.out.println("파일이 있습니다.");
			}
		   
		}
		    else{
			System.out.println("파일이 없습니다.");
		    }
		
		
		
		
		
		
		
	}

}
