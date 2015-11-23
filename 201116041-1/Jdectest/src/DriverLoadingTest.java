
public class DriverLoadingTest
{
    public DriverLoadingTest() {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading success!!");
        }
        catch (ClassNotFoundException e)
        {
            // TODO 자동 생성된 catch 블록
            e.printStackTrace();
        }
       
    }
    public static void main(String[] args)
    {
        // TODO 자동 생성된 메소드 스텁
        new DriverLoadingTest();
    }
    
}
