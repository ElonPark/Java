package factoryTest;

public class mainClass
{
    
    public static void main(String[] args)
    {
        System.out.println("Factory Test");
        Animal a1 = AnimalFactory.Crate("�����");
        a1.printDescription();
        Animal a2 = AnimalFactory.Crate("�����");
        a2.printDescription();
        Animal a3 = AnimalFactory.Crate("��");
        a3.printDescription();
        
    }
    
}
