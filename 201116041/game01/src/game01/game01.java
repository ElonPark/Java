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
						// ��ȸ ȸ�� ����, ..��..�� 
	win = lose = 0;
	while(true)
	{
		// 1. ramdom (1 ~ 100 || 0 ~ 99)
		r_num = (int)(Math.random() * 100) + 1;		
		
		
		////////////////// 10�� ��ȸ
		w = 0;
		clear = false;
		while(w < 10)
		{
			// 2. user Input 
			System.out.print("���� �Է� = ");
			u_num = scan.nextInt();	
			
			// 3. find(����)
			//    �ʹ� Ů�ϴ� or �ʹ� �۽��ϴ� or ����!!
			if(u_num > r_num){
				System.out.println("�ʹ� Ů�ϴ�");			
			}
			else if(u_num < r_num){
				System.out.println("�ʹ� �۽��ϴ�");			
			}
			else{
				clear = true;
				break;
			}			
			w++;
		}
		
		//////////////////////////////////////////
		
		// 4. ���
		if(clear){
			System.out.println("Clear!!");
			win++;
		}else{
			System.out.println("No Good~~");
			lose++;
		}		
		
		System.out.println("����� ������ " + win + "�� "
				+ lose + "���Դϴ�");
		
		int nextPlay;
		System.out.println("���� �� �Ͻðڽ��ϱ�? Yes(1) No(0)");
		nextPlay = scan.nextInt();	
		if(nextPlay == 0){
			break;
		}
	}
	
	
  }
}


/*// random number find 

int w=0,l=0;              //��ȸ ȸ��, ���� ��,��

//1. random ( 1~100 || 0~99)
while(true){
int random = (int)(Math.random()*100)+1; 
System.out.println("\n\n���� �ѹ� ã��");


/////////////10�� ��ȸ
Scanner sc = new Scanner(System.in);
//2. user Input

int usr=10;
int r=0,t=0;
System.out.print("����� ��ȸ�� ���߽ðڽ��ϱ�?\n :");
usr= sc.nextInt();


while(usr>t){
System.out.print("���ڴ�? :");
int an= sc.nextInt();
//3. find (����)
//�ʹ� Ů�ϴ�,�ʹ� �۽��ϴ�, ����!!
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
System.out.println("���ڰ� �ʹ� Ů�ϴ�");
t++;
if(t>=usr){
	System.out.println("\nȽ�� �ʰ�!");
	l++;
}
break;

case 2:
System.out.println("���ڰ� �ʹ� �۽��ϴ�");
t++;
if(t>=usr){
	System.out.println("\nȽ�� �ʰ�!");
	l++;
}
break;

case 3:
t= usr+1;
System.out.println("����!!");
w++;
break;

}
}
////////////////////////////

//4.���
System.out.println("\n"+w+"�� "+l+"��");


	}*/

