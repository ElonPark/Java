package classTest2;

import java.util.Scanner;

public class baseball {

    
	 int gues[]= new int[3];
	 int r_num[]=new int[3];
	
	
	 

    Scanner sc = new Scanner(System.in);
    int[] myRandom()
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
			r_num[w] =r+1; //1~10
			w++;
		}
		}
		return r_num;
	}
    int[] userInput()
    {
	int w=0;
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
		 return gues;
		 

    }
    void loop(){
	
	for(int k=0; k<10; k++){
	        int ball=0;
		int strike=0;
	        userInput();
		// Ball
		for(int i = 0; i< 3;i ++){
		for(int j = 0; j<3;j++)
		{
		if(r_num[i] == gues[j] && i!=j)
			ball++;
		}
		
		//strike
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
		System.out.println(" 3 ��Ʈ����ũ�� �̰���ϴ�!");
		break;
		}
		
		 }
       
    }
    void result(){
	 System.out.print("\n��ǻ���� ����");
	 for(int i = 0; i<3;i++){
		 System.out.print(r_num[i]+" ");
		 
	 }
	 System.out.print("�Դϴ�.");
	  System.out.println("\n=============================\n");
    }
}
