package adminCoffee;

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
        
        String sql = "SELECT ID, PASSWORD, NAME, BIRTHDAY, JOINDATE\n";
        sql += "FROM COFFEEACCOUNT\n";
        sql += "ORDER BY JOINDATE\n";
        ResultSet rs = null;
        
        List<UserDto> list = new ArrayList<UserDto>();
        
        try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                while(rs.next()){
                        UserDto userDto = new UserDto();
                        userDto.setId(rs.getString("ID"));
                        userDto.setName(rs.getString("NAME"));
                        userDto.setPasswd(rs.getString("PASSWORD"));
                        userDto.setBirth(rs.getString("BIRTHDAY"));
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
    
    List<TableView> TopOrder(){
        Connection conn = null;
        Statement stmt = null;
        
        conn = DBConnection.makeConnection();
        
        String sql = "SELECT  MENU ,COUNT(MENU)\n";
        sql += "FROM ORDERCOFFEE\n";
        sql += "GROUP BY MENU\n";
        sql += "ORDER BY COUNT(MENU) DESC\n";
        ResultSet rs = null;
        
        List<TableView> list = new ArrayList<TableView>();
        
        try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                while(rs.next()){
                        TableView tv = new TableView();
                        tv.setMenu(rs.getString("MENU"));
                        tv.setPrice(rs.getInt("COUNT(MENU)"));
                        list.add(tv);
                }                       
        }catch(SQLException e){
                e.printStackTrace();
        }finally{
            DBClose dbc = new DBClose();
            dbc.close(stmt, conn);
        }
        
        return list;
    }
    
    List<TableView> OrderList(){
        Connection conn = null;
        Statement stmt = null;
        
        conn = DBConnection.makeConnection();
        
        String sql = "SELECT ORDER_NUM, ID, MENU,COF_SIZE,ORDERTIME,PRICE, ORD_STATUS\n";
        sql += "FROM ORDERCOFFEE\n";
        sql += "ORDER BY ORDERTIME\n";
        ResultSet rs = null;
        
        List<TableView> list = new ArrayList<TableView>();
        
        try{
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                while (rs.next())
                {
                    TableView  tv = new TableView();
                    tv.setOrderNum(rs.getInt("ORDER_NUM"));
                    tv.setId(rs.getString("ID"));
                    tv.setMenu(rs.getString("MENU"));
                    tv.setSize(rs.getString("COF_SIZE"));
                    tv.setOrderTime(rs.getString("ORDERTIME"));
                    tv.setPrice(rs.getInt("PRICE"));
                    tv.setOrderStatus(rs.getString("ORD_STATUS"));
                        list.add(tv);
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
