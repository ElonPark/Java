package employees;

public class remove
{
    SingletonClass st = SingletonClass.getInstance();
    void method()
    {
        search se =new search();
        se.method();
        if(st.findNumber== -1) return;
        st.map.remove(st.findNumber);
        System.out.println("��� ��ȣ \""+st.findNumber + "\" ��  �����ʹ� ���� �Ǿ����ϴ�");
        
    }

}
