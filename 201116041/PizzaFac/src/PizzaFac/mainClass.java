package PizzaFac;

import java.util.LinkedList;
import java.util.Scanner;

public class mainClass
{
    
    public static void main(String[] args)
    {
        
        LinkedList<Person> list = new LinkedList<Person>();
        AbstractOder ao;
        Person cMan;
        ObserverClass obMan = new ObserverClass();
        obMan.addObserver(new ObserverA());
        Scanner sc = new Scanner(System.in);
        int b = 5;
        int a = 0;
        while (b > 0)
        {
            System.out.println("\n주문을 선택하세요");
            System.out.println("1.A세트 2.B세트 3.C세트 4.D세트");
            System.out.print("선택: ");
            a = sc.nextInt();
            a -= 1;
            switch (a)
            {
                case 0:
                    ao = new Aset();
                    cMan = new Person();
                    cMan.Crate(ao);
                    cMan.m_Size.OderSize();
                    cMan.m_Pizza.OderPizza();
                    cMan.m_Side.OderSide();
                    list.add(cMan);
                    break;
                case 1:
                    ao = new Bset();
                    cMan = new Person();
                    cMan.Crate(ao);
                    cMan.m_Size.OderSize();
                    cMan.m_Pizza.OderPizza();
                    cMan.m_Side.OderSide();
                    list.add(cMan);
                    
                    break;
                case 2:
                    ao = new Cset();
                    cMan = new Person();
                    cMan.Crate(ao);
                    cMan.m_Size.OderSize();
                    cMan.m_Pizza.OderPizza();
                    cMan.m_Side.OderSide();
                    list.add(cMan);
                    break;
                case 3:
                    ao = new Dset();
                    cMan = new Person();
                    cMan.Crate(ao);
                    
                    cMan.m_Size.OderSize();
                    cMan.m_Pizza.OderPizza();
                    cMan.m_Side.OderSide();
                    list.add(cMan);
                    break;
                    
            }
            
            b--;
            
        }
        System.out.print("\n");
        for (int i = 0; i < list.size(); i++)
        {
            
            Person v = list.get(i);
            System.out.print("주문 내역" + (i + 1) + ": ");
            v.m_Size.OderSize();
            v.m_Pizza.OderPizza();
            v.m_Side.OderSide();
           
        }
        obMan.notifyObservers(list);
    }
    
}
