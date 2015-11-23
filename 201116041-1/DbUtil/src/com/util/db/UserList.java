package com.util.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserList
{
    List<UserDto> userList(){
        Connection conn = null;
        Statement stmt = null;
        
        conn = DBConnection.makeConnection();
        
        String sql = "SELECT ID, NAME, AGE, JOINDATE\n";
        sql += "from MYTABLE\n";
        
        ResultSet rs = null;
        
        List<UserDto> list = new ArrayList<UserDto>();
        
        try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                while(rs.next()){
                        UserDto userDto = new UserDto();
                        userDto.setName(rs.getString("NAME"));
                        userDto.setID(rs.getString("ID"));
                        userDto.setAge(rs.getInt("AGE"));
                        userDto.setJoindate(rs.getString("JOINDATE"));
                        
                        list.add(userDto);
                }                       
        }catch(SQLException e){
                e.printStackTrace();
        }finally{
            DBClose dbc = new DBClose();
            dbc.close(stmt, conn);
        }
        
        return list;
    }
}
