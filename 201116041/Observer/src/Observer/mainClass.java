package Observer;

public class mainClass
{
    
    public static void main(String[] args)
    {
        ObserverClass obMan = new ObserverClass();
        
        obMan.addObserver(new ObserverA());
        obMan.addObserver(new ObserverB());
        
        obMan.notifyObservers("Hello World!");
        obMan.notifyObservers("Hi");
        
    }
    
}
