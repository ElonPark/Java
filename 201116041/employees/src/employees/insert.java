package employees;

import java.util.Scanner;



public class insert
{
    SingletonClass st = SingletonClass.getInstance();
 
    Employees _intput()
    {
        
        Employees em = new Employees();
        
        System.out.println("�̸��� �Է��ϼ���");
        em.setFirst_name(st.sc.next());
        System.out.println("�޴��� ��ȣ�� �Է��ϼ���");
        em.setPhone_number(st.sc.next());
        System.out.println("���� �о߸� �Է��ϼ���");
        em.setJob_id(st.sc.next());
        System.out.println("Ŀ�̼� ������ �Է��ϼ���");
        em.setCommission_pct(st.sc.nextDouble());
        return em;
    }
    void method()
    {
        Employees em = new Employees();
        System.out.println("��� ��ȣ�� �Է� �ϼ���");
        em.setEmployee_id(st.sc.nextInt());
        st.map.put(em.getEmployee_id(), _intput());
        
    }
}
