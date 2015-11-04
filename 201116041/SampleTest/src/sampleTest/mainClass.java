package sampleTest;

public class mainClass
{
    
    public static void main(String[] args)
    {
        // TODO 자동 생성된 메소드 스텁
        classNum1 cls1 = new classNum1();
        classNum2 cls2 = new classNum2();
        classNum3 cls3 = new classNum3();
        
        cls2.method();
        
        for (int i = 0; i < cls1.getlist().size(); i++)
        {
            
            System.out.println(cls1.getlist().get(i));
        }
        
    }
    
}
