package PizzaFac;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer
{

    @Override
    public void update(Observable o, Object arg)
    {
        
        LinkedList list = (LinkedList) arg;
  
        for(int i = 0; i<list.size(); i++)
        {
            Person v = (Person)list.get(i);
            System.out.println("주방에서 받은 주문:" );
            v.m_Size.OderSize();
            v.m_Pizza.OderPizza();
            v.m_Side.OderSide();
       
        }
       
        
    }

}
