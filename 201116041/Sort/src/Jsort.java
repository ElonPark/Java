import java.util.Scanner;

public class Jsort {

	static char[] numberInput(char []num)
	{
		Scanner sc = new Scanner(System.in);
		//numbers Input
		for(int i= 0; i<num.length; i++)
		{
		System.out.print((i+1)+"��° ���ڸ� �Է��ϼ���\n :");
		num[i]=sc.next().charAt(0);
		}
		return num;
	}
	public static void mySorting(char[] a, int b)
	{
		if (b== 1){
            //�ø� ����
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
			{//���� ����
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
		//sorting : ����
		// 1 5 2 4 3-> 1 2 3 4 5(�ø�) -> 5 4 3 2 1(����)
		// A B C  a b c
		
		//�� > �պ� > ����
		
		
		char[] Array;
		char b=0;
		int a= 0,c=0;
		// User input - ������ ���� 
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ ������ �Է��ϼ���\n :");
		a = sc.nextInt();
		
		// �����Ҵ�
		Array= new char[a];
		Array=numberInput(Array);
		/*
		//numbers Input
		for(int i= 0; i<a; i++){
		System.out.print((i+1)+"��° ���ڸ� �Է��ϼ���\n :");
		Array[i]=sc.next().charAt(0);
		}
		*/
		//up / down
		System.out.print("���ļ����� �Է��ϼ��� \n(1.�ø�/2.����)\n :");
		c = sc.nextInt();
		
		
		//sorting
		mySorting(Array, c);
			/*if (c== 1){
               //�ø� ����
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
			{//���� ����
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
			//���
			for(int i=0; i < Array.length;i++)
			{
				System.out.println("Array["+i+"]= "+Array[i]);
				
			}
	}
}
	

