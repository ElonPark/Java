package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverClass extends Observable
{
    
    private String preArg = null;
    
    public void notifyObservers(Object arg)
    {
        String str = (String) arg;
        
        if (str.equals(preArg)) return;
        preArg = str;
        
        setChanged();
        super.notifyObservers(str);
        
        clearChanged();
        
    }
    
}
