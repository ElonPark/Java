package singletonTest;

import java.util.*;
public class SingletonClass
{
    
    private static SingletonClass singlet = null;
    
    int snum;
    
    List<String> list;
    private SingletonClass()
    {
    
    }
    
    public static SingletonClass getInstance()
    {
        if (singlet == null)
        {
            singlet = new SingletonClass();
        }
        return singlet;
    }
    
}
