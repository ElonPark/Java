
public class OverLoadTest {
	
	public static int plus(int n1,int n2)
	{
		System.out.println("int plus(int n1,int n2)");
		return (n1+n2);
		
	}
	public static double plus(double n1)
	{
		System.out.println(" double plus(double n1)");
		return  (n1);
		
	}
	public static char plus(char n1,char n2)
	{
		System.out.println("char plus(char n1,char n2)");
		return (n1);
		
	}
	
	public static char plus(char n1)
	{
		System.out.println("char plus(char n1,char n2)");
		return (n1);
		
	}
	public static void plus(int n1)
	{
		System.out.println("void plus(int)");
		
		
	}
	
	public static double plus(double n1,double n2)
	{
		System.out.println("double plus(double n1,double n2)");
		return (n1+n2);
		
	}
	
	//���ϰ��̳� �μ��� �ٸ����� �����ε带 �� �� ����.
	//�ڷ����̳� �ڷ����� ������ ������ �ν�
	
	static void method(int a,int...num) //�����μ��� �տ� �����μ��� �ڿ�== int []num
	{
		int sum = 0;
		for(int i= 0;i< num.length; i++)
		{
			sum +=num[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		//Over Load (�޼ҵ���� ������ �μ��� �ڷ����� �ٸ��ų� ������ �ٸ� ��
		plus(100,125);
		plus(100.00,125.00);
		plus(100.00);
		plus(10);
		plus('a');
		plus(100.00,125.00);
		
		//���� �μ�
		method(2,3,4,5,6);

	}

}
