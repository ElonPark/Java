import java.util.Scanner;

public class gbb {

	public static void main(String[] args) {
		//가위 바위 보
		while(true){
		//random 랜덤 (0== 가위, 1== 바위 ,2== 보)
		int r_gbb= (int)(Math.random()*3);
		
		//유저 입력 input =1,2,3
		 Scanner sc =new Scanner(System.in);
		 String input;
		 System.out.print("가위, 바위, 보를 입력하세요\n: ");
	     input =sc.next();
	     
	     
		//판정 finding ==switch  default
		switch(input)
		{
		case "가위": 
			if(r_gbb ==0){
				System.out.println("컴퓨터 = 가위.\n");
				System.out.println("비겼습니다.\n");	
			}
			else if(r_gbb ==1){
				System.out.println("컴퓨터 = 바위.\n");
				System.out.println("졌습니다.\n");	
			}
			else if(r_gbb ==2){
				System.out.println("컴퓨터 = 보.\n");
				System.out.println("이겼습니다.\n");	
			}
			break;
		case "바위": 
			if(r_gbb ==0){
				System.out.println("컴퓨터 = 가위.\n");
				System.out.println("이겼습니다.\n");
				
			}
			else if(r_gbb ==1){
				System.out.println("컴퓨터 = 바위.\n");
				System.out.println("비겼습니다.\n");	
			}
			else if(r_gbb ==2){
				System.out.println("컴퓨터 = 보.\n");
				System.out.println("졌습니다.\n");	
			}
			break;
		case "보": 
			if(r_gbb ==0){
				System.out.println("컴퓨터 = 가위.\n");
				System.out.println("졌습니다.\n");	
			}
			else if(r_gbb ==1){
				System.out.println("컴퓨터 = 바위.\n");
				System.out.println("이겼습니다.\n");	
			}
			else if(r_gbb ==2){
				System.out.println("컴퓨터 = 보.\n");
				System.out.println("비겼습니다.\n");	
			}
			break;
			
		default:
				System.out.println("잘못 입력하셨습니다.\n");	

		} 
	
		//결과 result()
		/*
		 * int result;
		 * result =(r_num -u_num+2)%3;
		 */
		}
	}

}
