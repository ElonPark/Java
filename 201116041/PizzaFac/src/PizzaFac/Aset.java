package PizzaFac;

public class Aset implements AbstractOder
{
 public Pizza CreatePizza()
 {
     return new Nomal();
 }
    
    public Side CreateSide()
    {
        return new Spaghetti();
    }

    @Override
    public Pizza CreateSize()
    {
        // TODO �ڵ� ������ �޼ҵ� ����
        return new Rsize();
    }

}
