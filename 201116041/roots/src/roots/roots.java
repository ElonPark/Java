
package roots;
import java.util.Scanner;
public class roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		        int a, b, c;
		        double discriminant, root1, root2;
		        
		        // 근의 공식을 이용한 ax제곱 + bx + c 의 x 값을 구하기 위해
		        // a, b, c 의 값을 각각 받는다.
		        Scanner scan = new Scanner(System.in);
		        
		        // ax제곱의  a 값을 받는다.
		        System.out.print("Enter the coefficient of x squared: ");   
		        a = scan.nextInt();
		        
		        // bx 의 b의 값을 받는다.
		        System.out.print("Enter the coefficient of x: " );
		        b = scan.nextInt();
		        
		        // c 값을 받는다.
		        System.out.print("Enter the constant: " );
		        c = scan.nextInt();
		        
		        // 근의 공식에 적용
		        discriminant = Math.pow(b, 2) - (4 * a * c);
		        root1 = ((-1 * b) + Math.pow(discriminant, 1/2)) / (2*a);
		        root2 = ((-1 * b) - Math.pow(discriminant, 1/2)) / (2*a);
		        
		        // 출력
		        System.out.println("Root #1: " + root1);
		        System.out.println("Root #2: " + root2);
		    }

		

	

}
