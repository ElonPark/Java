






/*
 * class 클래스 명 인스턴스명= new 클래스명(); 
 * 
 * 
 * class 클래스
 * {
 * 
 * 
 * }
 */
class MyClass 
{
	//영역
     //멤버 변수
	 //멤버 메소드(함수)	
	
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
