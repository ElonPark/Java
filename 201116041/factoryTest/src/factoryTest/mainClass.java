package factoryTest;

public class mainClass
{
    
    public static void main(String[] args)
    {
        System.out.println("Factory Test");
        Animal a1 = AnimalFactory.Crate("고양이");
        a1.printDescription();
        Animal a2 = AnimalFactory.Crate("고양이");
        a2.printDescription();
        Animal a3 = AnimalFactory.Crate("개");
        a3.printDescription();
        
    }
    
}
