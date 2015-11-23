package factoryTest;

public class AnimalFactory
{

    public static Animal Crate(String animalName) 
    {
        if(animalName == null)
        {
            System.out.println("생성 불가");
        }
        else if(animalName.equals("고양이"))
        {
            return new Cat();
        }
        else if(animalName.equals("소"))
        {
            return new Cow();
        }
        else if(animalName.equals("개"))
        {
            return new Dog();
        }
        return null;
    }
}
