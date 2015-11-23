package factoryTest;

public class AnimalFactory
{

    public static Animal Crate(String animalName) 
    {
        if(animalName == null)
        {
            System.out.println("���� �Ұ�");
        }
        else if(animalName.equals("�����"))
        {
            return new Cat();
        }
        else if(animalName.equals("��"))
        {
            return new Cow();
        }
        else if(animalName.equals("��"))
        {
            return new Dog();
        }
        return null;
    }
}
