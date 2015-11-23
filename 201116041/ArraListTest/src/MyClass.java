
public class MyClass
{
    
    int number; // primary Key
    
    String name;
    
    String age;
    
    MyClass(int num, String na,String a){
        number = num;
        name = na;
        age=a;
    }
    
    void input(int num, String na)
    {
        number = num;
        name = na;
    }
    int getNumber()
    {
        return number; 
    }
    
    
    void output()
    {
        System.out.println("number= " + number + " name: " + name+" age: "+age);
    }
}
