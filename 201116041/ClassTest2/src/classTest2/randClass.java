package classTest2;

import java.util.Scanner;

public class randClass {

    
   
    int j =0;
    int gues=0;
    int r=0;
    boolean clear = false;
    
   // ��ȸ ȸ�� ����, ..��..�� 
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
		 System.out.print("\n���ڸ� �Է��ϼ���\n: ");
		 gues=sc.nextInt();
		
		 }catch(Exception e){
				System.out.println("�ٽ� �����Ͻñ� �ٶ��ϴ�");
			}
	 return gues;
    }
    //finding
    boolean loop()
    {
	while(j <10)
	{
	    userInput();
	 // 3. find(����)
	 //    �ʹ� Ů�ϴ� or �ʹ� �۽��ϴ� or ����!!
	 clear = false;
	 if(gues > r){
	 System.out.println("�ʹ� Ů�ϴ�");			
	 	}
	 else if(gues <r ){
	 System.out.println("�ʹ� �۽��ϴ�");			
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
	
	System.out.println("����� ������ " + win + "�� "
			+ lose + "���Դϴ�");
    }
}
