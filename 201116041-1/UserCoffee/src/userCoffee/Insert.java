package userCoffee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Insert
{
    int sineup(String id, String pw, String name, String birth)
    {
        int cnt = 0;
        Connection conn = null;
        Statement stmt  = null;
        conn = DBConnection.makeConnection();
        
        //쿼리
        String sql = "INSERT INTO COFFEEACCOUNT(ID, PASSWORD, NAME, BIRTHDAY, JOINDATE)\n";
        sql += "VALUES('"+id+"','"+pw+"','"+name+"','"+birth+"', SYSDATE)";
        
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
    
    int Order(int orderNum,String id, String menu, String size, int price, String status)
    {
        int cnt = 0;
        
        Connection conn = null;
        Statement stmt  = null;
        conn = DBConnection.makeConnection();
        
        //쿼리
        String sql = "INSERT INTO ORDERCOFFEE(ORDER_NUM, ID,MENU, COF_SIZE, ORDERTIME, PRICE, ORD_STATUS)\n";
        sql += "VALUES('"+orderNum+"','"+id+"','"+menu+"','"+size+"',TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS'),'"+price+"', '"+status+"')";
        
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
