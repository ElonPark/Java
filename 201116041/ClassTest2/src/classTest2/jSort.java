package classTest2;

import java.util.Scanner;

public class jSort {

        private int Array[];
        private int count;
        private int upDown;
	
        private void init()
	{
		Scanner scan = new Scanner(System.in);
		
		// User Input - ������ ����
		System.out.print("������ ���� ���� �Է�=");
		count = scan.nextInt();				
				
		Array = new int[count];	// �����Ҵ�	
		
		input();
		
		// up / down
		System.out.print("�ø�(1) , ����(2) = ");
		upDown = scan.nextInt();
	}
	private void input()
	{
		Scanner scan = new Scanner(System.in);
		// numbers Input
		for(int i = 0;i < Array.length; i++)
		{
			System.out.print((i + 1) + "��° number = ");
			Array[i] = scan.nextInt();			
		}				
	}
	private void numSorting()
	{
		for(int i = 0;i < Array.length - 1; i++)
		{
			for(int j = 1 + i;j < Array.length; j++)
			{
				if(upDown == 1)	// �ø�
				{
					if(Array[i] > Array[j])
					{						
						int temp = Array[i];
						Array[i] = Array[j];
						Array[j] = temp;
					}
				}else{			// ����	
					if(Array[i] < Array[j])
					{
						int temp = Array[i];
						Array[i] = Array[j];
						Array[j] = temp;
					}					
				}
			}
		}	
		
	}	
	private void result()
	{
		for(int i = 0;i < count; i++)
		{
			System.out.println("Array["+i+"] = "+ Array[i]);			
		}		
	}
	public void sortProcess()
	{
	  init();	
	  numSorting();
	  result();
	}

}
