package cloneTest;

public class Person implements Cloneable//규칙 1.클론에이블 상속 받음
{
    
    @Override //오버라이딩 해준다
    protected Person clone()
    {
        // TODO 자동 생성된 메소드 스텁
        try
        {
            return (Person) super.clone();//슈퍼
        }
        catch (CloneNotSupportedException e)
        {
            throw new AssertionError();
        }
    }
    
    int age;
    
    void setAge(int a)
    {
        age = a;
    }
    
    void setPrint()
    {
        System.out.println("age = " + age);
    }
}
