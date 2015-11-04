package range01;

import java.util.Scanner;

public class range01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double x1=0,x2=0;
		double y1=0,y2=0;
		
		
		while(true){
			System.out.print("\nx1, y1값을 입력하세요\n x1: ");
			x1 =scan.nextDouble();
			System.out.print(" y1: ");
			y1 =scan.nextDouble();
			System.out.print("x2, y2값을 입력하세요\n x2: ");
			x2 =scan.nextDouble();
			System.out.print(" y2: ");
			y2 =scan.nextDouble();
			
			System.out.print(" "+x1+" . "+y1+"\n "+x2+" . "+y2+"\n");
			
			double m1 = Math.pow((y2-x1),2);
			double m2 = Math.pow((x2-y1),2);
			
			double m3 = Math.sqrt(m1+m2);
			System.out.println("거리는 "+m3+"입니다.\n");
			
		}
		
	}

}