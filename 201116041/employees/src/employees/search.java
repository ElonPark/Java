package employees;

import java.util.Iterator;

public class search
{

    void method()
    {
        SingletonClass st = SingletonClass.getInstance();
        System.out.print("검색할 이름을 입력 = ");
        String sName = st.sc.next();
        int fNumber = -1;
       
        Iterator<Integer> keys = st.map.keySet().iterator();
        while (keys.hasNext())
        {
            int key = keys.next();
            if (st.map.get(key).getFirst_name().equals(sName))
            {
                fNumber = key;
                break;
            }
        }
        if (fNumber != -1)
        {
            System.out.println("검색한 데이터는 있습니다");
            System.out.println("해당 사원의 번호는 " + (fNumber) + "입니다");
        }
        else
        {
            System.out.println("검색한 데이터가 없습니다");
        }
        st.findNumber = fNumber;
    }
   
}
