package ddddd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert
{

    int join(String movie, String quest, String hint1, String hint2, String hint3, String chr)
    {
        int cnt = 0;
        Connection conn = null;
        Statement stmt  = null;
        conn = DBConnection.makeConnection();
        
       
        String sql = "INSERT INTO MOVIE(MOVIE, QUEST, HINT1, HINT2, HINT3, CHR)\n";
        sql += "VALUES('"+movie+"','"+quest+"','"+hint1+"','"+hint2+"','"+hint3+"','"+chr+"')";
        
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
        System.out.println(cnt+"input");
        return cnt;
    }
}
