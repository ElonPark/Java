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
           // TODO 자동 생성된 메소드 스텁
           return new Lsize();
       }
}
