package insertTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertTest
{
    public InsertTest()
    {
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
    
    private Connection makeConnection()
    {
        Connection conn = null;
        
        try
        {
            conn = DriverManager.getConnection(
            "jdbc:oracle:thin:@192.168.36.91:1521:xe","hr", "hrhr");
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
       
        InsertTest it = new InsertTest();
       // Connection conn = ct.makeConnection();
        String id = "1112";
        String name = "일지매";
        int age = 17;
        int cnt = it.join(id, name, age);
        
        
    }
    
    private int join(String id, String name, int age)
    {
        int cnt = 0;
        Connection conn = null;
        Statement stmt  = null;
        conn = makeConnection();
        
        //쿼리
        String sql = "INSERT INTO MYTABLE(ID, NAME, AGE, JOINDATE)\n";
        sql += "VALUES('"+id+"','"+name+"',"+age+", sysdate)";
        
        try
        {
            stmt = conn.createStatement();
            cnt = stmt.executeUpdate(sql);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }finally {
            try {
                if(stmt != null) {
                    stmt.close();
                  
                }
                if(conn != null)
                {
                    conn.close();
                }
            }catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(cnt+"개 입력 성공");
        return cnt;
    }
}
