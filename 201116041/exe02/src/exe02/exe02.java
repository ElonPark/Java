package exe02;

import java.util.Scanner;

public class exe02 {
	static void dec(int b){
	        // 10진수 -> 2진수
		
		String a = Integer.toBinaryString(b);
		
		System.out.println(a);
	
	}
	static void dec(long a){
			//10진수 -> 16진수 
	
		String c = Long.toHexString(a);
		
		System.out.println("0x"+c);
		
	}		
	static void bin(int b){
		//2진수 -> 16진수
	String a=Integer.toString(b);
	int c=Integer.valueOf(a, 2);
	System.out.println("0x"+Integer.toHexString(c));
	}
	static void bin(long b){
			//2진수 -> 10진수
		
		String a=Long.toString(b);
		System.out.println(Integer.valueOf(a, 2));
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,c;
		long b,d;
	
		System.out.println("2진수로 변환할 10진수 숫자를 입력");
		a= sc.nextInt();
		dec(a);
		System.out.println("16진수로 변환할 10진수 숫자를 입력");
		b= sc.nextLong();
		dec(b);
		System.out.println("16진수로 변환할 2진수 숫자를 입력");
		c= sc.nextInt();
		bin(c);
		System.out.println("10진수로 변환할 2진수 숫자를 입력");
		d= sc.nextLong();
		bin(d);

	}

}
