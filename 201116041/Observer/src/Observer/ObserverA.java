package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer
{

    @Override
    public void update(Observable o, Object arg)
    {
       String str = (String)arg;
       
       System.out.println("A 관찰자 통지가 되었습니다.: "+str);
        
    }

}
