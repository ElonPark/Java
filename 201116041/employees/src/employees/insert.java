package employees;

import java.util.Scanner;



public class insert
{
    SingletonClass st = SingletonClass.getInstance();
 
    Employees _intput()
    {
        
        Employees em = new Employees();
        
        System.out.println("이름을 입력하세요");
        em.setFirst_name(st.sc.next());
        System.out.println("휴대폰 번호를 입력하세요");
        em.setPhone_number(st.sc.next());
        System.out.println("업무 분야를 입력하세요");
        em.setJob_id(st.sc.next());
        System.out.println("커미션 비율을 입력하세요");
        em.setCommission_pct(st.sc.nextDouble());
        return em;
    }
    void method()
    {
        Employees em = new Employees();
        System.out.println("사원 번호를 입력 하세요");
        em.setEmployee_id(st.sc.nextInt());
        st.map.put(em.getEmployee_id(), _intput());
        
    }
}
