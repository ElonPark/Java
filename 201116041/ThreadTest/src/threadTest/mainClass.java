package threadTest;

public class mainClass
{
    
    public static void main(String[] args)
    {
        System.out.println("Thread Test");
        
        Thread t1 = new ThreadEx("��");
        Thread t2 = new ThreadEx("��");
        Thread t3 = new ThreadEx("!!");
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("���α׷� ����");
        
    }
    
}
