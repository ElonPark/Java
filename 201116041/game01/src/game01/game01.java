package game01;

import java.util.Scanner;

public class game01 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	// random number find
	System.out.println("---------Number Find---------");
	
	int r_num, u_num;
	int w;
	boolean clear = false;
	int win, lose;
						// 기회 회수 결정, ..승..패 
	win = lose = 0;
	while(true)
	{
		// 1. ramdom (1 ~ 100 || 0 ~ 99)
		r_num = (int)(Math.random() * 100) + 1;		
		
		
		////////////////// 10번 기회
		w = 0;
		clear = false;
		while(w < 10)
		{
			// 2. user Input 
			System.out.print("수를 입력 = ");
			u_num = scan.nextInt();	
			
			// 3. find(판정)
			//    너무 큽니다 or 너무 작습니다 or 빙고!!
			if(u_num > r_num){
				System.out.println("너무 큽니다");			
			}
			else if(u_num < r_num){
				System.out.println("너무 작습니다");			
			}
			else{
				clear = true;
				break;
			}			
			w++;
		}
		
		//////////////////////////////////////////
		
		// 4. 결과
		if(clear){
			System.out.println("Clear!!");
			win++;
		}else{
			System.out.println("No Good~~");
			lose++;
		}		
		
		System.out.println("당신의 전적은 " + win + "승 "
				+ lose + "패입니다");
		
		int nextPlay;
		System.out.println("한판 더 하시겠습니까? Yes(1) No(0)");
		nextPlay = scan.nextInt();	
		if(nextPlay == 0){
			break;
		}
	}
	
	
  }
}


/*// random number find 

int w=0,l=0;              //기회 회수, 게임 승,패

//1. random ( 1~100 || 0~99)
while(true){
int random = (int)(Math.random()*100)+1; 
System.out.println("\n\n램덤 넘버 찾기");


/////////////10번 기회
Scanner sc = new Scanner(System.in);
//2. user Input

int usr=10;
int r=0,t=0;
System.out.print("몇번의 기회로 맞추시겠습니까?\n :");
usr= sc.nextInt();


while(usr>t){
System.out.print("숫자는? :");
int an= sc.nextInt();
//3. find (판정)
//너무 큽니다,너무 작습니다, 빙고!!
if(an>random){
r=1;	
}
else if(an<random){	
r=2;
}
else if(an==random){	
r=3;			
}
switch(r){	
case 1:
System.out.println("숫자가 너무 큽니다");
t++;
if(t>=usr){
	System.out.println("\n횟수 초과!");
	l++;
}
break;

case 2:
System.out.println("숫자가 너무 작습니다");
t++;
if(t>=usr){
	System.out.println("\n횟수 초과!");
	l++;
}
break;

case 3:
t= usr+1;
System.out.println("빙고!!");
w++;
break;

}
}
////////////////////////////

//4.결과
System.out.println("\n"+w+"승 "+l+"패");


	}*/

