package constructorTest;

public class constructorTest {

    public static void main(String[] args) {
	
	mClass cls = new mClass("Hello java");
	
	cls=null;//소멸자 대용으로 쓸수 있음
	
	System.gc();//가비지 콜렉터

    }

}
