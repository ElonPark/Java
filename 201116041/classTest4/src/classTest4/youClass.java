package classTest4;

public class youClass extends myClass {
    
    youClass()
    {
	super(23);
	System.out.println("youClass youClass()");
    }
    
    @Override
    void myMethod() {
	// TODO �ڵ� ������ �޼ҵ� ����
	super.myMethod();
    }

    void Func()
    {
	mNumber =12;
    }
    
    /*
     * Over Ride : ��� ���� Ŭ����(�ڽ� Ŭ����)���� �޼ҵ带 ������
     */
    void method()
    {
	super.method();
	System.out.println("youClass Over Ride method()");
    }
    
    

}
