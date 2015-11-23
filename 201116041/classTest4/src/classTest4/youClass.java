package classTest4;

public class youClass extends myClass {
    
    youClass()
    {
	super(23);
	System.out.println("youClass youClass()");
    }
    
    @Override
    void myMethod() {
	// TODO 자동 생성된 메소드 스텁
	super.myMethod();
    }

    void Func()
    {
	mNumber =12;
    }
    
    /*
     * Over Ride : 상속 받은 클래스(자식 클래스)에서 메소드를 재정의
     */
    void method()
    {
	super.method();
	System.out.println("youClass Over Ride method()");
    }
    
    

}
