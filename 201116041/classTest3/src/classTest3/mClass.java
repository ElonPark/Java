package classTest3;

public class mClass {
    
    private int tag;
    static int number=0;
    public void setTag(int  newtag)//setter
    {
	this.tag = newtag;
    }
    
    public int getTag()//getter
    {
	return tag;
    }
    public void mCalssMethod()
    {
	System.out.println("mClass mClassMethod()");
    }
    public void plusNum()
    {
	
	
	number++;
	
	System.out.println("number= "+number);
    }
    
    public static mClass staticMethod()
    {
	
	System.out.println("mClass staticMethod()");
	mClass cls = new mClass();
	
	cls.mCalssMethod();
	
	return cls;
    }

}
