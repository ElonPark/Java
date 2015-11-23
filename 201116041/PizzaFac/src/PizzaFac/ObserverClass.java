package PizzaFac;

import java.util.LinkedList;
import java.util.Observable;

public class ObserverClass extends Observable
{

    private LinkedList preArg = null;
    public void notifyObservers(Object arg)
    {
        LinkedList list = (LinkedList) arg;
        
        if (list.equals(preArg)) return;
        preArg = list;
        
        setChanged();
        super.notifyObservers(list);
        
        clearChanged();
        
    }
}
