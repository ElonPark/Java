package classTest2;

import java.util.Scanner;

public class randClass {

    
   
    int j =0;
    int gues=0;
    int r=0;
    boolean clear = false;
    
   // 기회 회수 결정, ..승..패 
    int win=0,lose=0;
  
    Scanner sc = new Scanner(System.in);
    // random number
    int init()
    {
	r = (int)(Math.random()*100)+1;
	return r;
    }
    //user Input
    int userInput()
    {
	 try{
		 System.out.print("\n숫자를 입력하세요\n: ");
		 gues=sc.nextInt();
		
		 }catch(Exception e){
				System.out.println("다시 기입하시기 바랍니다");
			}
	 return gues;
    }
    //finding
    boolean loop()
    {
	while(j <10)
	{
	    userInput();
	 // 3. find(판정)
	 //    너무 큽니다 or 너무 작습니다 or 빙고!!
	 clear = false;
	 if(gues > r){
	 System.out.println("너무 큽니다");			
	 	}
	 else if(gues <r ){
	 System.out.println("너무 작습니다");			
	 }
	 else{
	 clear = true;
	 break;
	 }			
	    j++; 
	}
       return clear;
	
    }
    
    //result
    void result()
    {
       
	if(clear){
		System.out.println("Clear!!");
		win++;
	}else{
		System.out.println("Not Good~~");
		lose++;
	}		
	
	System.out.println("당신의 전적은 " + win + "승 "
			+ lose + "패입니다");
    }
}
