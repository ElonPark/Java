
package roots;
import java.util.Scanner;
public class roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		        int a, b, c;
		        double discriminant, root1, root2;
		        
		        // ���� ������ �̿��� ax���� + bx + c �� x ���� ���ϱ� ����
		        // a, b, c �� ���� ���� �޴´�.
		        Scanner scan = new Scanner(System.in);
		        
		        // ax������  a ���� �޴´�.
		        System.out.print("Enter the coefficient of x squared: ");   
		        a = scan.nextInt();
		        
		        // bx �� b�� ���� �޴´�.
		        System.out.print("Enter the coefficient of x: " );
		        b = scan.nextInt();
		        
		        // c ���� �޴´�.
		        System.out.print("Enter the constant: " );
		        c = scan.nextInt();
		        
		        // ���� ���Ŀ� ����
		        discriminant = Math.pow(b, 2) - (4 * a * c);
		        root1 = ((-1 * b) + Math.pow(discriminant, 1/2)) / (2*a);
		        root2 = ((-1 * b) - Math.pow(discriminant, 1/2)) / (2*a);
		        
		        // ���
		        System.out.println("Root #1: " + root1);
		        System.out.println("Root #2: " + root2);
		    }

		

	

}
