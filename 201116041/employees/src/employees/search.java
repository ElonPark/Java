package employees;

import java.util.Iterator;

public class search
{

    void method()
    {
        SingletonClass st = SingletonClass.getInstance();
        System.out.print("�˻��� �̸��� �Է� = ");
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
            System.out.println("�˻��� �����ʹ� �ֽ��ϴ�");
            System.out.println("�ش� ����� ��ȣ�� " + (fNumber) + "�Դϴ�");
        }
        else
        {
            System.out.println("�˻��� �����Ͱ� �����ϴ�");
        }
        st.findNumber = fNumber;
    }
   
}
