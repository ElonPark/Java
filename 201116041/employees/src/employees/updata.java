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
        
        System.out.println("수정할 데이터를 입력해 주십시오");
        
         em = ins._intput();
        st.map.put(st.findNumber, em);
    }
}
