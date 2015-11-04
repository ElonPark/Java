package adminCoffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update
{
    void update(int onum)
    {
     
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        conn = DBConnection.makeConnection();
        
        String sql = "UPDATE ORDERCOFFEE\n";
        sql += "SET ORD_STATUS = '¿Ï¼º'\n";
        sql += "WHERE ORDER_NUM = '" + onum + "'";
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
    
    void UserFix(String id,String pw,String name, String birth)
    {
     
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        conn = DBConnection.makeConnection();
        
        String sql = "UPDATE COFFEEACCOUNT\n";
        sql += "SET PASSWORD = '"+pw+"', NAME = '"+name+"', BIRTHDAY = '"+birth+"'\n";
        sql += "WHERE ID = '" + id + "'";
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
