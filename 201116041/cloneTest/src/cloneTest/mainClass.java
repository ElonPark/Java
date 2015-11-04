package cloneTest;

public class mainClass
{
    
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setAge(30);
        
        Person p2 = p1.clone();
        
        p1.setPrint();
        p2.setPrint();
        
        p1.setAge(40);
        p1.setPrint();
        p2.setPrint();
        
    }
}
