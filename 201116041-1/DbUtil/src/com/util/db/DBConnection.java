package com.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection
{
    static {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading success!!");
        }
        catch (ClassNotFoundException e)
        {
            // TODO 자동 생성된 catch 블록
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
                                               "jdbc:oracle:thin:@192.168.36.91:1521:xe",
                                               "hr", "hrhr");
            System.out.println("DB connection Success!!");
            
        }
        catch (SQLException e)
        {
            
            e.printStackTrace();
        }
        
        return conn;
    }
}
