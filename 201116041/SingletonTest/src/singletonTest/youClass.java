package singletonTest;

public class youClass
{

    private int num;
    void method()
    {
        SingletonClass st = SingletonClass.getInstance();
        num =  st.snum;
    }
}
