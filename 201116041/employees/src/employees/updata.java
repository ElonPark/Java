package employees;



public class updata
{
    SingletonClass st = SingletonClass.getInstance();
    
    void method()
    {
        Employees em = new Employees();
        search sch = new search();
        insert ins = new insert();
        sch.method();
        if (st.findNumber == -1) return;
        
        System.out.println("������ �����͸� �Է��� �ֽʽÿ�");
        
         em = ins._intput();
        st.map.put(st.findNumber, em);
    }
}
