package userCoffee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Search
{
   
    UserDto Asearch(String id, String pw)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        conn = DBConnection.makeConnection();
        
        UserDto userDto = null;
        
        // Äõ¸®
        String sql = "SELECT ID, PASSWORD, NAME, BIRTHDAY, JOINDATE\n";
        sql += "FROM COFFEEACCOUNT\n";
        sql += "WHERE ID = '" + id + "' AND PASSWORD = '"+pw+ "' ";
        
        try
        {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                userDto = new UserDto();
                userDto.setId(rs.getString("ID"));
                userDto.setName(rs.getString("NAME"));
                userDto.setPasswd(rs.getString("PASSWORD"));
                userDto.setBirth(rs.getString("BIRTHDAY"));
                userDto.setJoindate(rs.getString("JOINDATE"));
                
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            
        }
        finally
        {
            DBClose dbc = new DBClose();
            dbc.close(rs, stmt, conn);
        }
        
        return userDto;
    }
    TableView Osearch(int num)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        conn = DBConnection.makeConnection();
        
        TableView tv = null;
        
        // Äõ¸®
        String sql = "SELECT ORDER_NUM, ID, MENU,COF_SIZE,ORDERTIME,PRICE, ORD_STATUS\n";
        sql += "FROM ORDERCOFFEE\n";
        sql += "WHERE ORDER_NUM = " + num + "";
        
        try
        {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                tv = new TableView();
                tv.setOrderNum(rs.getInt("ORDER_NUM"));
                tv.setId(rs.getString("ID"));
                tv.setMenu(rs.getString("MENU"));
                tv.setSize(rs.getString("COF_SIZE"));
                tv.setOrderTime(rs.getString("ORDERTIME"));
                tv.setPrice(rs.getInt("PRICE"));
                tv.setOrderStatus(rs.getString("ORD_STATUS"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            
        }
        finally
        {
            DBClose dbc = new DBClose();
            dbc.close(rs, stmt, conn);
        }
        
        return tv;
    }
    
    TableView NumSearch()
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        TableView tv = null;
        
        conn = DBConnection.makeConnection();
      
        
        // Äõ¸®
        String sql = "SELECT MAX(ORDER_NUM)\n";
        sql += "FROM ORDERCOFFEE\n";
        
        
        try
        {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next())
            {
                tv = new TableView();
                tv.setOrderNum(0);
                tv.setOrderNum(rs.getInt("MAX(ORDER_NUM)"));
                
            }
           
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            
        }
        finally
        {
            DBClose dbc = new DBClose();
            dbc.close(rs, stmt, conn);
        }
        return tv;
       
    }
}
