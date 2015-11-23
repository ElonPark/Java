import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Baseball {
    // 게임이 시작되면 이름,점수 입력 //쓰기 //읽기
	//파일이 생성된 상태로 시작
	static void myRandom(int[] ran)
	{
		int r,w;
		w=0;
		boolean swit[] = new boolean[10];
		for(int i=0;i<10;i++)swit[i]=false;// 00000 00000
		
		while(w<3)
		{
		r = (int)(Math.random()*10);
		if(swit[r]==false)
		{
			swit[r] = true; //00000 10000
			ran[w] =r+1; //1~10
			w++;
		}
		}
	}
	
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
	static void FileAppedWrite(String filename,String name,String appStr)
	{
		try {
			  
				//추가 쓰기
			File file = new File("E:/"+filename+".txt");
			if(chekBeforeWriteFile(file))
		    {
				
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write("\r\n"+name+"님의 점수는 "+appStr+"점 입니다 ");
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
	
	static int FileLineCount(String filename)
	{
		int w =0;
		try {
			//File read
			File file = new File("E:/"+filename+".txt");
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
	static void FileDataLoad(String filename,String[] DataArr)
	{
		try {
			//File read
			File file = new File("E:/"+filename+".txt");
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

	static void mkNewFile(String filename){
  //파일명 입력 
		File File = new File("E:\\temp\\subDir\\"+filename+".txt");
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
	
	public static void main(String[] args) {
		/* int[] arr = new int[3];
	        int ran;
	        int check = 0;
	        boolean ck = false;
	        
	        
	        //Random(1~10) -> 3" rn1 != rn2 !=rn3
	        while(true){ 
	         check = 0;
	         for (int i = 0; i <3 ; i++) {
	          ran = (int) (Math.random() * 10)+1; 
	          arr[i] = ran; 
	          for (int j = 0; j <= i; j++) {
	           if (arr[i] == arr[j] && i!=j) { 
	            ck = false;
	            ran = (int) (Math.random() * 10)+1; // 
	            arr[i] = ran;
	            break;
	           }else{
	            ck = true;
	           }
	          }
	          if(ck ==true){
	           check++;
	          }
	         }
	         if(check == arr.length){
	          break;
	         }
	        }
	        
			 
			 ////////////
			 //user input ->3
			
			 //Finding -> Strike ..Ball
				 int strike = 0;
				 int ball = 0;
				// Ball
					for(int i = 0; i< 3;i ++){
						for(int j = 0; j<3;j++)
						{
							if(arr[i] == gues[j] && i!=j)
							{
								ball++;
							}
						}
					}
						//strike
						for(int i = 0; i<3; i++){
							if(arr[i] == gues[i])
							{
								strike++;
							}
						
					}
			 
			 for(int i = 0; i<3;i++){
				 if (arr[i] == gues[i]) {	
				 strike++;
				
					} 
				   else if (arr[0] == gues[1] || arr[0] == gues[2]) 
					{
						ball++;
					    }
					
					else if (arr[1] == gues[0] || arr[1] == gues[2]) 
					{
						ball++;
						}
					else if (arr[2] == gues[0] || arr[2] == gues[1]) 
					{
						ball++;
				        }*/
				              
			 
					

			 ////////////
		 Scanner sc = new Scanner(System.in);
		 String Gamename ="BaseBall";
		 System.out.println("\n=======# 게임 시작! #==========\n");
		
		while(true){
		
		 int lineNumber= FileLineCount(Gamename);
			String []strBuf = new String[lineNumber];
			
			 FileDataLoad(Gamename,strBuf);
			 
			//출력
			for(int i=0;i<strBuf.length; i++)
			{
				System.out.println(strBuf[i]);
			}
	  System.out.println("\n=============================");
	  
		 System.out.print("이름을 입력하세요\n :");
		 String name =sc.next();
		 
		 
		 int user =0;
		 int gues[]= new int[3];
		 int r_num[]=new int[3];
		 int strike = 0;
		 int ball = 0;
		 int fin =0;
		 
		  myRandom(r_num);
		
		 System.out.println("=============================");
		 
			
		 try{
				 System.out.print("몇번만에 맞추시겠습니까?\n: ");
				 user= sc.nextInt();
		 }catch(Exception e){
				System.out.println("다시 기입하시기 바랍니다");
			}	
		 int turn=user;
		 while(user !=0){
		 int w =0;
		 
		 while(w<3){
			 try{
			 System.out.print((w+1)+"번 숫자를 입력하세요\n: ");
			 gues[w]=sc.nextInt();
				w++;
			 }catch(Exception e){
					System.out.println("다시 기입하시기 바랍니다");
				}	
		   }    
		 
			 
		 System.out.print("입력한 숫자: ");
			 for(int i = 0; i<gues.length;i++){
					 System.out.print(gues[i]+" ");
					 
				 }	
			 System.out.println(" ");
			 System.out.println("=============================");

		// Ball
		for(int i = 0; i< 3;i ++){
			for(int j = 0; j<3;j++)
			{
				if(r_num[i] == gues[j] && i!=j)
				{
					ball++;
				}
			}
		}
			//strike
			for(int i = 0; i<3; i++){
				if(r_num[i] == gues[i])
				{
					strike++;
				}
			
		}  
		
			if(strike == 0 && ball == 0){
				System.out.println("아웃\n");
			} else {
				System.out.println(" "+strike + " 스트라이크 " + ball + " 볼\n");
			}
			if(strike==3){
				int hap = turn-user+1;
				String number=turn+"번중에서"+hap+"번만에 이겼습니다.";
				System.out.println(" 3 스트라이크로 이겼습니다!");
				fin =5;
				break;
			}
			 user--;
	 }
		 
		 //Result
		 System.out.print("\n컴퓨터의 답은");
		 for(int i = 0; i<3;i++){
			 System.out.print(r_num[i]+" ");
			 
		 }
		 System.out.print("입니다.");
		  System.out.println("\n=============================\n");	
		//게임 끝나면 점수 계산 	 
		 int score=(strike+3)+ball+fin;
		 String s=  Integer.toString(score);
		 FileAppedWrite(Gamename,name,s);
			 }
	}
}
