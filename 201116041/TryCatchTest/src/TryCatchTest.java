import java.util.InputMismatchException;
import java.util.Scanner;

class Person{
	String name;
}
public class TryCatchTest {

	public static void main(String[] args) {
		//try catch (== Debug)
		/*
		int n=10;
		if(n == 10){
			
		}
		//runtime 오류 : 실행 thread == timer
		
		while(true)
		{
			//수치 입력
		}
		
		int n[] = {18,29,36};
		
		try{
		System.out.println("Start");
		for(int i=0; i<4; i++)
		{
			System.out.println(n[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 범위를 초과하였습니다.");
		 
		}finally{

			System.out.println("End");
		}
		
		
		//Null 예외 처리
		try{
			
		String str = null; // == 0;  메모리에 처음 쓰레기값을 모두 0으로 채움
		
		System.out.println(str.length());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
		
		Person p = new Person();
		p.name = "최필종";
		System.out.println(p.name.length());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		int[] Array = {1,2,3};
		try{
		System.out.println(Array[0]);
		System.out.println(Array[1]);
		System.out.println(Array[2]);
		System.out.println(Array[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		try{
		String s = "java";
		System.out.println(s.charAt(4));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		//NumberFormatException
		
		int num;
		try{
		num= Integer.parseInt("a");
		System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		try{
		int[] num = new int[2];
		num[0] =0;
		num[1] =1;
		
		System.out.println(num[1]/num[0]);
		
		System.out.println("처리 종료");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 에러 발생");
		}catch(ArithmeticException e)
		{
			System.out.println("수치 오류 발생");
		}
		finally{
			System.out.println("사후 처리");
		}*/
		
		//입력 받고 문자일 경우 , 예외를 발생
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		/*int input = 0;
		try{
		input = sc.nextInt();
		System.out.print(input);
		}catch(Exception e){
			e.printStackTrace();
			System.out.print("숫자를 입력하세요");
		}*/
		boolean flug =true;
		String str= sc.next();
		int len =str.length();
		for(int i = 0; i< len; i++)
		{
			int x =str.charAt(i)-48;
			if(x <0 || x >9){
			flug  =false;
			break;
			}
		}
		
		if(!flug){ //flug ==false
			System.out.println("숫자가 아니다");
			return;
			
		}
		int number = Integer.parseInt(str);
		System.out.println("number= "+number);
	}

}
