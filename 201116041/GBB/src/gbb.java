import java.util.Scanner;

public class gbb {

	public static void main(String[] args) {
		//���� ���� ��
		while(true){
		//random ���� (0== ����, 1== ���� ,2== ��)
		int r_gbb= (int)(Math.random()*3);
		
		//���� �Է� input =1,2,3
		 Scanner sc =new Scanner(System.in);
		 String input;
		 System.out.print("����, ����, ���� �Է��ϼ���\n: ");
	     input =sc.next();
	     
	     
		//���� finding ==switch  default
		switch(input)
		{
		case "����": 
			if(r_gbb ==0){
				System.out.println("��ǻ�� = ����.\n");
				System.out.println("�����ϴ�.\n");	
			}
			else if(r_gbb ==1){
				System.out.println("��ǻ�� = ����.\n");
				System.out.println("�����ϴ�.\n");	
			}
			else if(r_gbb ==2){
				System.out.println("��ǻ�� = ��.\n");
				System.out.println("�̰���ϴ�.\n");	
			}
			break;
		case "����": 
			if(r_gbb ==0){
				System.out.println("��ǻ�� = ����.\n");
				System.out.println("�̰���ϴ�.\n");
				
			}
			else if(r_gbb ==1){
				System.out.println("��ǻ�� = ����.\n");
				System.out.println("�����ϴ�.\n");	
			}
			else if(r_gbb ==2){
				System.out.println("��ǻ�� = ��.\n");
				System.out.println("�����ϴ�.\n");	
			}
			break;
		case "��": 
			if(r_gbb ==0){
				System.out.println("��ǻ�� = ����.\n");
				System.out.println("�����ϴ�.\n");	
			}
			else if(r_gbb ==1){
				System.out.println("��ǻ�� = ����.\n");
				System.out.println("�̰���ϴ�.\n");	
			}
			else if(r_gbb ==2){
				System.out.println("��ǻ�� = ��.\n");
				System.out.println("�����ϴ�.\n");	
			}
			break;
			
		default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");	

		} 
	
		//��� result()
		/*
		 * int result;
		 * result =(r_num -u_num+2)%3;
		 */
		}
	}

}
