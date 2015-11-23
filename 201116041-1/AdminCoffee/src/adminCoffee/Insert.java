package adminCoffee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert
{

    int join(String id, String name, int age)
    {
        int cnt = 0;
        Connection conn = null;
        Statement stmt  = null;
        conn = DBConnection.makeConnection();
        
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
            DBClose dbc = new DBClose();
            dbc.close(stmt, conn);
        }
        System.out.println(cnt+"개 입력 성공");
        return cnt;
    }
}
