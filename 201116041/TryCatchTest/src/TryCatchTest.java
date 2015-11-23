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
		//runtime ���� : ���� thread == timer
		
		while(true)
		{
			//��ġ �Է�
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
			System.out.println("�迭 ������ �ʰ��Ͽ����ϴ�.");
		 
		}finally{

			System.out.println("End");
		}
		
		
		//Null ���� ó��
		try{
			
		String str = null; // == 0;  �޸𸮿� ó�� �����Ⱚ�� ��� 0���� ä��
		
		System.out.println(str.length());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
		
		Person p = new Person();
		p.name = "������";
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
		
		System.out.println("ó�� ����");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�迭 ���� �߻�");
		}catch(ArithmeticException e)
		{
			System.out.println("��ġ ���� �߻�");
		}
		finally{
			System.out.println("���� ó��");
		}*/
		
		//�Է� �ް� ������ ��� , ���ܸ� �߻�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		/*int input = 0;
		try{
		input = sc.nextInt();
		System.out.print(input);
		}catch(Exception e){
			e.printStackTrace();
			System.out.print("���ڸ� �Է��ϼ���");
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
			System.out.println("���ڰ� �ƴϴ�");
			return;
			
		}
		int number = Integer.parseInt(str);
		System.out.println("number= "+number);
	}

}
