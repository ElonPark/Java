package instanceofTest;

public class instanceofTest {

    public static void main(String[] args) {
	
	Object  obj[] = new Object[2];
	
	obj[0] = new myClass();
	obj[1] = new youClass();
	
	for(int i =0; i<obj.length; i++)
	{
	    if(obj[i]==null)return;
	    
	    if(obj[i] instanceof myClass)
	    {
		System.out.println("myClass입니다");
	    }else{
		System.out.println("myClass가 아닙니다");

	    }
	}

    }

}
