package constructorTest;

public class mClass {
    
    int num;
    boolean b;
    /*생성자 : 메소드
     * 리턴 값이 없다.
     * 인수를 가질 수 있다.
     * Over Load 가능
     * 생성자 명은 클래스 명과 같다.
     * 생성시 자동 호출된다.
     * 임의적으로 호출할 수는 없다.
     */
    
    mClass()
    {
	System.out.println("mClass 기본 생성자()");
    }
    mClass(String s)
    {
	//this(10, true);
	System.out.println("mClass 기본 생성자(String s)"+s);
    }
    mClass(int i)
    {
	System.out.println("mClass 기본 생성자(int i)"+i);
    }
    mClass(int i,String s)
    {
	System.out.println("mClass 기본 생성자(int i,String s)"+i+s);
    }
    
    
    /*소멸자
     * 
     */

}
