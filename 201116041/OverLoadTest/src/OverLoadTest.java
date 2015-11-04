
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
	
	//리턴값이나 인수가 다를때는 오버로드를 쓸 수 없다.
	//자료형이나 자료형의 개수를 가지고 인식
	
	static void method(int a,int...num) //고정인수는 앞에 가변인수는 뒤에== int []num
	{
		int sum = 0;
		for(int i= 0;i< num.length; i++)
		{
			sum +=num[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		//Over Load (메소드명은 같지만 인수의 자료형이 다르거나 갯수가 다른 것
		plus(100,125);
		plus(100.00,125.00);
		plus(100.00);
		plus(10);
		plus('a');
		plus(100.00,125.00);
		
		//가변 인수
		method(2,3,4,5,6);

	}

}
