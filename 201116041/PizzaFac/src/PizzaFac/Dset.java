package PizzaFac;

public class Dset implements AbstractOder
{
    public Pizza CreatePizza()
    {
        return new Special();
    }
       
       public Side CreateSide()
       {
           return new Salad();
       }
       @Override
       public Pizza CreateSize()
       {
           // TODO �ڵ� ������ �޼ҵ� ����
           return new Lsize();
       }
}
