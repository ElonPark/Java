package com.util.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search
{
    UserDto search(String id)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        conn = DBConnection.makeConnection();
        
        UserDto userDto = null;
        
        // Äõ¸®
        String sql = "SELECT ID, NAME, AGE, JOINDATE\n";
        sql += "FROM MYTABLE\n";
        sql += "WHERE ID = '" + id + "'";
        
        try
        {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                userDto = new UserDto();
                
                userDto.setName(rs.getString("NAME"));
                userDto.setID(rs.getString("ID"));
                userDto.setAge(rs.getInt("AGE"));
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
    
}
