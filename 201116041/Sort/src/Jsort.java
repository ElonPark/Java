import java.util.Scanner;

public class Jsort {

	static char[] numberInput(char []num)
	{
		Scanner sc = new Scanner(System.in);
		//numbers Input
		for(int i= 0; i<num.length; i++)
		{
		System.out.print((i+1)+"번째 문자를 입력하세요\n :");
		num[i]=sc.next().charAt(0);
		}
		return num;
	}
	public static void mySorting(char[] a, int b)
	{
		if (b== 1){
            //올림 차순
				for(int i=0; i<a.length-1;i++)
				{
				for(int j= 1+i;j<a.length; j++)
				{	
				if(a[i] > a[j])
				{
					
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				}
				}
				
			}
			else if (b== 2)
			{//내림 차순
				for(int i=0; i<a.length-1;i++)
				{
				for(int j= 1+i;j<a.length; j++)
				{	
				if(a[i] < a[j])
				{
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				}
				}
				
			}
	
	}
	public static void main(String[] args) {
		//sorting : 정렬
		// 1 5 2 4 3-> 1 2 3 4 5(올림) -> 5 4 3 2 1(내림)
		// A B C  a b c
		
		//퀵 > 합병 > 버블
		
		
		char[] Array;
		char b=0;
		int a= 0,c=0;
		// User input - 정렬할 갯수 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정렬할 갯수를 입력하세요\n :");
		a = sc.nextInt();
		
		// 동적할당
		Array= new char[a];
		Array=numberInput(Array);
		/*
		//numbers Input
		for(int i= 0; i<a; i++){
		System.out.print((i+1)+"번째 문자를 입력하세요\n :");
		Array[i]=sc.next().charAt(0);
		}
		*/
		//up / down
		System.out.print("정렬순서를 입력하세요 \n(1.올림/2.내림)\n :");
		c = sc.nextInt();
		
		
		//sorting
		mySorting(Array, c);
			/*if (c== 1){
               //올림 차순
				for(int i=0; i<Array.length-1;i++)
				{
				for(int j= 1+i;j<Array.length; j++)
				{	
				if(Array[i] > Array[j])
				{
					mySwap(Array[i],Array[j]);
					char temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}
				}
				}
				
			}
			else if (c== 2)
			{//내림 차순
				for(int i=0; i<Array.length-1;i++)
				{
				for(int j= 1+i;j<Array.length; j++)
				{	
				if(Array[i] < Array[j])
				{
					char temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}
				}
				}
				
			}
			*/
			//출력
			for(int i=0; i < Array.length;i++)
			{
				System.out.println("Array["+i+"]= "+Array[i]);
				
			}
	}
}
	

