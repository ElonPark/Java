package PizzaFac;

public class Cset implements AbstractOder
{
    public Pizza CreatePizza()
    {
        return new Special();
    }
       
       public Side CreateSide()
       {
           return new Spaghetti();
       }
       @Override
       public Pizza CreateSize()
       {
           // TODO �ڵ� ������ �޼ҵ� ����
           return new Lsize();
       }
}
