package PizzaFac;

public class Bset implements AbstractOder
{
    public Pizza CreatePizza()
    {
        return new Nomal();
    }
       
       public Side CreateSide()
       {
           return new Salad();
       }
       @Override
       public Pizza CreateSize()
       {
           // TODO �ڵ� ������ �޼ҵ� ����
           return new Rsize();
       }
}
