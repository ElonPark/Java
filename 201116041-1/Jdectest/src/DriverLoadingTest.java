
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
            // TODO �ڵ� ������ catch ���
            e.printStackTrace();
        }
       
    }
    public static void main(String[] args)
    {
        // TODO �ڵ� ������ �޼ҵ� ����
        new DriverLoadingTest();
    }
    
}
