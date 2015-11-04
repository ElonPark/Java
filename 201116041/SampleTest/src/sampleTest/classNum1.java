package sampleTest;

import java.util.LinkedList;
import java.util.List;

public class classNum1
{
    List<String> myList = new LinkedList<String>();
    
    void method()
    {
        myList.add("Hello");
        myList.add("World");
        myList.add("Hihi");
        
    }
    
    void setlist(String s)
    {
        myList.add(s);
    }
    
    List<String> getlist()
    {
        return myList;
    }
    
}
