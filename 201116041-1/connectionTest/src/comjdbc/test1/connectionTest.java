package comjdbc.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class connectionTest
{
    public connectionTest()
    {
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
    
    private Connection makeConnection()
    {
        Connection conn = null;
        
        try
        {
            conn = DriverManager.getConnection(
                                               "jdbc:oracle:thin:@192.168.36.91:1521:xe",
                                               "hr", "hrhr");
            System.out.println("DB connection Success!!");
            
        }
        catch (SQLException e)
        {
            
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static void main(String[] args)
    {
        // TODO �ڵ� ������ �޼ҵ� ����
        connectionTest ct = new connectionTest();
       // Connection conn = ct.makeConnection();
        String id = "1111";
        String name = "ȫ�浿";
        int age = 17;
        int cnt = ct.join(id, name, age);
        
        
    }
    private int join(String id, String name, int age)
    {
        int cnt = 0;
        Connection conn = null;
        Statement stmt  = null;
        conn = makeConnection();
        
        //����
        String sql = "INSERT INTO MYTABLE(ID, NAME, AGE, JOINDATE)\n";
        sql += "VALUES('"+id+"','"+name+"',"+age+", sysdate)";
        
        try
        {
            stmt = conn.createStatement();
            cnt = stmt.executeUpdate(sql);
        }
        catch (SQLException e)
        {
            // TODO �ڵ� ������ catch ���
            e.printStackTrace();
        }finally {
            
        }
        System.out.println(cnt+"�� �Է� ����");
        return cnt;
    }
    private int del()
    {
        int cnt = 0;
        Connection conn = null;
        Statement stmt  = null;
        conn = makeConnection();
        
        //����
        String sql = "DELETE FROM MYTABLE\n";
        
        try
        {
            stmt = conn.createStatement();
            cnt = stmt.executeUpdate(sql);
        }
        catch (SQLException e)
        {
            // TODO �ڵ� ������ catch ���
            e.printStackTrace();
        }finally {
            
        }
        System.out.println(cnt+"�� ���� ����");
        return cnt;
    }
    
    
}












