package threadTest;

public class ThreadEx extends Thread
{
    String msg;
    
    ThreadEx(String msg)
    {
        this.msg = msg;
    }
    
    @Override
    public void run()
    {
        for (int i = 0; i < 50; i++)
        {
            System.out.println(msg);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO �ڵ� ������ catch ���
                e.printStackTrace();
            }
        }
    }
    
}
