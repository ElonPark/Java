package employees;



import java.io.File;
import java.util.*;

public class SingletonClass
{
    private static SingletonClass singlet = null;
    int findNumber;
    File file = new File("E:/employees.txt");
    Scanner sc = new Scanner(System.in);
    Map<Integer, Employees> map = new HashMap<Integer, Employees>();
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
