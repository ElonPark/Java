package employees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class print
{
    SingletonClass st = SingletonClass.getInstance();
    
    WriteData wd = new WriteData();
    
    String fname = "employees";
    
    void _sort(int snum)
    {
        
        Collection cols = st.map.values();
        List temps = new ArrayList(cols);
        Collections.sort(temps, new Comparator<Employees>()
                         {    
    public int compare(Employees obj1, Employees obj2)
    {
        if (snum==1)
        {
            return obj1.getEmployee_id() < obj2.getEmployee_id() ? -1
                    : obj1.getEmployee_id() > obj2.getEmployee_id() ? 1 : 0;
        }
        else if (snum == 2) { return obj1.getFirst_name().compareToIgnoreCase(obj2.getFirst_name()); }
        return -1;
    }
    
                         });
                         
                     }
    
    void method()
    {
       
        
        System.out.println("정렬 기준을 선택하세요 1.번호 , 2.이름");
        int n = st.sc.nextInt();
        _sort(n);
        Iterator<Integer> keys = st.map.keySet().iterator();
        while (keys.hasNext())
        {
            Integer key = keys.next();
            Employees em = st.map.get(key);
            System.out.println("사번: " + key + " 이름: " + em.getFirst_name()
                    + " 휴대폰: " + em.getPhone_number() + "  업무: "
                    + em.getJob_id() + " 커미션: " + em.getCommission_pct());
            wd.method("사번: " + key + " 이름: " + em.getFirst_name() + " 휴대폰: "
                    + em.getPhone_number() + "  업무: " + em.getJob_id()
                    + " 커미션: " + em.getCommission_pct());
                    
        }
    }
    
}
