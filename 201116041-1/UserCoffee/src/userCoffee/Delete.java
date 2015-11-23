package userCoffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Delete
{
 
    void Cancel(int onu )
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        conn = DBConnection.makeConnection();
        String sql = "DELETE \n";
        sql += "FROM ORDERCOFFEE\n";
        sql += "WHERE ORDER_NUM = '" + onu + "'";
        
        try
        {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
           
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            
        }
        finally
        {
            DBClose dbc = new DBClose();
            dbc.close(stmt, conn);
        }
       
    }
}
