






/*
 * class Ŭ���� �� �ν��Ͻ���= new Ŭ������(); 
 * 
 * 
 * class Ŭ����
 * {
 * 
 * 
 * }
 */
class MyClass 
{
	//����
     //��� ����
	 //��� �޼ҵ�(�Լ�)	
	
	int number;
	
	void method()
	{
		
		System.out.println("MyClass method()");
	}
	
	
	
	
}


public class CalssTest {

	public static void main(String[] args) {
	
		
		MyClass cls = new MyClass();
		
		cls.number = 123;
		
		cls.method();
		MyClass []arrCls = new MyClass[5];
		//arrCls[0].number = 123;
		//arrCls[0].method();
		
		String []str = new String[0];
		
		
		
		YouClass ycls = new  YouClass();
		
		int r=ycls.method(123);
		
		
		System.out.println("r= "+r);
		
		

	}

}
