package dataArrTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class MyData
{
    
    LinkedList<Datas> myda = new LinkedList<Datas>();
    
    int findNumber;
    
    Scanner sc = new Scanner(System.in);
    
    MyData()
    {
    
    }
    
    Datas _input()
    {
        Datas data = new Datas();
        
        System.out.println("��ȣ�� �����ϼ���");
        data.setNumber(sc.nextInt());
        System.out.println("�̸��� �Է��ϼ���");
        data.setName(sc.next());
        System.out.println("�޴��� ��ȣ�� �Է��ϼ���");
        data.setPhoneNumber(sc.next());
        System.out.println("�ּҸ� �Է��ϼ���");
        data.setAddress(sc.next());
        return data;
    }
    
    void _insert()
    {
        myda.add(_input());
        
    }
    
    void _remove()
    {
        _search();
        if (findNumber == -1) return;
        
        myda.remove(findNumber);
        System.out.println((findNumber + 1) + "���� �����ʹ� �����Ǿ����ϴ�");
        
    }
    
    void _updata()
    {
        _search();
        if (findNumber == -1) return;
        
        System.out.println("������ �����͸� �Է��� �ֽʽÿ�");
        Datas dt = _input();
        
        myda.set(findNumber, dt);
        
    }
    
    void _search()
    {
        System.out.print("�˻��� �̸��� �Է� = ");
        String sName = sc.next();
        int fNumber = -1;
        
        for (int i = 0; i < myda.size(); i++)
        {
            if (myda.get(i).getName().equals(sName))
            {
                fNumber = i;
                break;
            }
        }
        if (fNumber != -1)
        {
            System.out.println("�˻��� �����ʹ� �ֽ��ϴ�");
            System.out.println("�����ʹ� " + (fNumber + 1) + "��°�Դϴ�");
        }
        else
        {
            System.out.println("�˻��� �����Ͱ� �����ϴ�");
        }
        this.findNumber = fNumber;
    }
    
    void _sort(int snum)
    {
        
        Collections.sort(myda, new Comparator<Datas>() {
            public int compare(Datas obj1, Datas obj2)
            {
                if (snum == 1)
                {
                    return obj1.getNumber() < obj2.getNumber() ? -1
                            : obj1.getNumber() > obj2.getNumber() ? 1 : 0;
                }
                else if (snum == 2) { return obj1.getName()
                        .compareToIgnoreCase(obj2.getName()); }
                return -1;
            }
            
        });
        
    }
    
    
    void _print()
    {
        System.out.println("���� ������ �����ϼ��� 1.��ȣ , 2.�̸�");
        int n = sc.nextInt();
        _sort(n);
        
        for (int i = 0; i < myda.size(); i++)
        {
            Datas dt = myda.get(i);
            System.out.println(dt.getNumber() + " " + dt.getName() + " "
                    + dt.getPhoneNumber() + " " + dt.getAddress());
        }
    }
    
}
