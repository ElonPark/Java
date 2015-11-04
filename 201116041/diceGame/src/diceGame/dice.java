package diceGame;

import java.awt.Toolkit;
import java.util.Scanner;

public class dice {
    int coin=20;
    int bat=0;
    int plus=0;
    int r_num[]=new int[2];
    int dP=0;
    boolean win=false;
    Scanner sc = new Scanner(System.in);
    
    int[] myRandom()
	{
		int r,w;
		w=0;
		boolean swit[] = new boolean[6];
		for(int i=0;i<6;i++)swit[i]=false;// 00000 00000
		
		while(w<2)
		{
		r = (int)(Math.random()*6);
		if(swit[r]==false)
		{
			swit[r] = true; //00000 10000
			r_num[w] =r+1; //1~10
			w++;
		}
		}
		return r_num;
	}
    
    void  userInput()
    {
	
	System.out.println("배팅할 코인 수는?");
	bat=sc.nextInt();
	coin-=bat;
	System.out.println("두 주사위의 합은?");
	plus=sc.nextInt();
	if(plus == 2){
	    System.out.print("2는 제시할 수 없습니다.\n다시 입력하세요\n: ");
		plus=sc.nextInt();
		
	}else if(plus==12){
	    System.out.print("12는 제시할 수 없습니다.\n다시 입력하세요\n: ");
		plus=sc.nextInt();
	}
	
    }
    void finding()
    {
	
	userInput();
	dP=r_num[0]+r_num[1];
	if(dP==plus){
	    if(dP == 3 || dP == 11){
		bat= bat*18;
		coin+=bat;
	    }else if(dP == 4 || dP == 10)
	    {
		bat= bat*12;
		coin+=bat;
	    }
	    else if(dP == 5 || dP == 9)
	    {
		bat= bat*9;
		coin+=bat;
	    }
	    else if(dP == 6 || dP == 8)
	    {
		bat= bat*7;
		coin+=bat;
	    }
	    else if(dP == 7)
	    {
		bat= bat*6;
		coin+=bat;
	    }
	
	    win=true;
	}else
	{
	    
	    win=false;
	}
	
	
    }
    void result()
    {
	
	if(win==true){
	    System.out.println("맞췄습니다. 코인: "+coin+"개\n");
	    Toolkit.getDefaultToolkit().beep();
	}else{
	    System.out.println("틀렸습니다. 코인: "+coin+"개\n");
	    Toolkit.getDefaultToolkit().beep();
	}
	System.out.println("주사위의 숫자는 "+r_num[0]+", "+r_num[1]+" 입니다.");
    }
    
    
    

}
