package exe02;

import java.util.Scanner;

public class exe02 {
	static void dec(int b){
	        // 10���� -> 2����
		
		String a = Integer.toBinaryString(b);
		
		System.out.println(a);
	
	}
	static void dec(long a){
			//10���� -> 16���� 
	
		String c = Long.toHexString(a);
		
		System.out.println("0x"+c);
		
	}		
	static void bin(int b){
		//2���� -> 16����
	String a=Integer.toString(b);
	int c=Integer.valueOf(a, 2);
	System.out.println("0x"+Integer.toHexString(c));
	}
	static void bin(long b){
			//2���� -> 10����
		
		String a=Long.toString(b);
		System.out.println(Integer.valueOf(a, 2));
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,c;
		long b,d;
	
		System.out.println("2������ ��ȯ�� 10���� ���ڸ� �Է�");
		a= sc.nextInt();
		dec(a);
		System.out.println("16������ ��ȯ�� 10���� ���ڸ� �Է�");
		b= sc.nextLong();
		dec(b);
		System.out.println("16������ ��ȯ�� 2���� ���ڸ� �Է�");
		c= sc.nextInt();
		bin(c);
		System.out.println("10������ ��ȯ�� 2���� ���ڸ� �Է�");
		d= sc.nextLong();
		bin(d);

	}

}
