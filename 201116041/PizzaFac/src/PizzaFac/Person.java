package PizzaFac;

public class Person
{
    Pizza m_Pizza;
    Pizza m_Size;
    Side m_Side;
    
    void Crate(AbstractOder ao)
    {
        this.m_Pizza = ao.CreatePizza();
        this.m_Side = ao.CreateSide();
        this.m_Size = ao.CreateSize();
    }

}
