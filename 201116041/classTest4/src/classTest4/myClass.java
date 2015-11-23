package classTest4;

public class myClass {
    
    protected int mNumber;
    final int 	CARDNUMBER = 20; //변수->상수 == c언어에서는 const
    
    myClass()
    {
	
	mNumber = 0;
	System.out.println("myClass myClass()");
    }
    myClass(int m)
    {
	mNumber = m;
	System.out.println("myClass myClass(int m)");
    }


    void method()
    {
	System.out.println("myClass method() m= "+mNumber);
    }
    void myMethod()
    {
	System.out.println("myClass myMethod()");
    }
}
