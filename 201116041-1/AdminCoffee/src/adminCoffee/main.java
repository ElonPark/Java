package adminCoffee;



public class main
{
    
    public static void main(String[] args)
    {
        Baseclass base = new Baseclass();
        try {
        base.method();
        }
        catch(Exception e) {
            e.printStackTrace();
           
    
        }
        finally{
            System.out.println("���� �Դϴ�. �ٽ� �����ϼ���");
           
        }
        
    }
    
}
