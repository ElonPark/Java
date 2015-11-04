package threadTest;

public class mainClass
{
    
    public static void main(String[] args)
    {
        System.out.println("Thread Test");
        
        Thread t1 = new ThreadEx("퐁");
        Thread t2 = new ThreadEx("당");
        Thread t3 = new ThreadEx("!!");
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("프로그램 종료");
        
    }
    
}
