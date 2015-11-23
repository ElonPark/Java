package singletonTest;

public class SingletonTest
{
    
    public static void main(String[] args)
    {
        /*
        SingletonClass st = SingletonClass.getInstance();
        SingletonClass st1 = SingletonClass.getInstance();
        
        System.out.println(st.hashCode());
        System.out.println(st1.hashCode());
        
         * pattern singleton : 1개 인스턴스만을 생성하고 접촉한다.
         */
        
        myClass mcls = new myClass();
        youClass ycls = new youClass();
        
        mcls.method();
        ycls.method();
    }
    
}
