package userCoffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Update
{

    void ReOrder(String id,String menu,String size,int price)
    {
     
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        conn = DBConnection.makeConnection();
        
        String sql = "UPDATE ORDERCOFFEE\n";
        sql += "SET MENU = '"+menu+"' , COF_SIZE = "+size+", PRICE = "+price+" \n";
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
