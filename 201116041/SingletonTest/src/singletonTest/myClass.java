package singletonTest;

public class myClass
{
    
    private int number = 13213;
    void method()
    {
        SingletonClass st = SingletonClass.getInstance();
        
        st.snum= number;
    }

}
