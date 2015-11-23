package packageTest.com.src;

public class myClass
{
    int tag = 10;
    
    public void method()//default가 붙지만 생략되어져있다. 디폴트는 같은 패키지에서만 접근이 가능하다. 다른 패키지에서 사용하기 위해서는 퍼블릭을 선언해야한다.
    {
        System.out.println("myClass method()");
    }

}
