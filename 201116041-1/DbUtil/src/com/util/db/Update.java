package com.util.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update
{
    void update(String id,String name,int age)
    {
     
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        conn = DBConnection.makeConnection();
        
        String sql = "UPDATE MYTABLE\n";
        sql += "SET NAME = '"+name+"' , AGE = "+age+"\n";
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
