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
            System.out.println("오류 입니다. 다시 실행하세요");
           
        }
        
    }
    
}
