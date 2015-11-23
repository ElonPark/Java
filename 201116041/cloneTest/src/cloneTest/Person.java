package cloneTest;

public class Person implements Cloneable//��Ģ 1.Ŭ�п��̺� ��� ����
{
    
    @Override //�������̵� ���ش�
    protected Person clone()
    {
        // TODO �ڵ� ������ �޼ҵ� ����
        try
        {
            return (Person) super.clone();//����
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
