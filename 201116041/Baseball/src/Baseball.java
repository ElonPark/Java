import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Baseball {
    // ������ ���۵Ǹ� �̸�,���� �Է� //���� //�б�
	//������ ������ ���·� ����
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
			  
				//�߰� ����
			File file = new File("E:/"+filename+".txt");
			if(chekBeforeWriteFile(file))
		    {
				
				FileWriter fileWriter = new FileWriter(file, true);
				fileWriter.write("\r\n"+name+"���� ������ "+appStr+"�� �Դϴ� ");
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

	static void mkNewFile(String filename){
  //���ϸ� �Է� 
		File File = new File("E:\\temp\\subDir\\"+filename+".txt");
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
		 System.out.println("\n=======# ���� ����! #==========\n");
		
		while(true){
		
		 int lineNumber= FileLineCount(Gamename);
			String []strBuf = new String[lineNumber];
			
			 FileDataLoad(Gamename,strBuf);
			 
			//���
			for(int i=0;i<strBuf.length; i++)
			{
				System.out.println(strBuf[i]);
			}
	  System.out.println("\n=============================");
	  
		 System.out.print("�̸��� �Է��ϼ���\n :");
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
				 System.out.print("������� ���߽ðڽ��ϱ�?\n: ");
				 user= sc.nextInt();
		 }catch(Exception e){
				System.out.println("�ٽ� �����Ͻñ� �ٶ��ϴ�");
			}	
		 int turn=user;
		 while(user !=0){
		 int w =0;
		 
		 while(w<3){
			 try{
			 System.out.print((w+1)+"�� ���ڸ� �Է��ϼ���\n: ");
			 gues[w]=sc.nextInt();
				w++;
			 }catch(Exception e){
					System.out.println("�ٽ� �����Ͻñ� �ٶ��ϴ�");
				}	
		   }    
		 
			 
		 System.out.print("�Է��� ����: ");
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
				System.out.println("�ƿ�\n");
			} else {
				System.out.println(" "+strike + " ��Ʈ����ũ " + ball + " ��\n");
			}
			if(strike==3){
				int hap = turn-user+1;
				String number=turn+"���߿���"+hap+"������ �̰���ϴ�.";
				System.out.println(" 3 ��Ʈ����ũ�� �̰���ϴ�!");
				fin =5;
				break;
			}
			 user--;
	 }
		 
		 //Result
		 System.out.print("\n��ǻ���� ����");
		 for(int i = 0; i<3;i++){
			 System.out.print(r_num[i]+" ");
			 
		 }
		 System.out.print("�Դϴ�.");
		  System.out.println("\n=============================\n");	
		//���� ������ ���� ��� 	 
		 int score=(strike+3)+ball+fin;
		 String s=  Integer.toString(score);
		 FileAppedWrite(Gamename,name,s);
			 }
	}
}
