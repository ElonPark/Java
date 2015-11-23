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
        System.out.println("사원 번호 \""+st.findNumber + "\" 의  데이터는 삭제 되었습니다");
        
    }

}
