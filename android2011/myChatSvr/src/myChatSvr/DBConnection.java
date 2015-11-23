package myChatSvr;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    static {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            
        }
        catch (ClassNotFoundException e)
        {
            
            e.printStackTrace();
        }
    }

    private DBConnection() {
    
    }
    public static Connection makeConnection()
    {
        Connection conn = null;
        
        try
        {
            conn = DriverManager.getConnection(
                                               "jdbc:oracle:thin:@192.168.36.92:1521:xe",
                                               "hr", "hr");
            
            
        }
        catch (SQLException e)
        {
            
            e.printStackTrace();
        }
        
        return conn;
    }
}

