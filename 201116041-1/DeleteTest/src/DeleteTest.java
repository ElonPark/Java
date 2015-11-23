import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteTest
{
    
    
    public DeleteTest()
    {
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
    
    private Connection makeConnection()
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
    
    public static void main(String[] args)
    {
        DeleteTest ut =new DeleteTest();
        Scanner sc = new Scanner(System.in);
        List<UserDto> lista= ut.userList();
        for (int i = 0; i < lista.size(); i++)
        {
            UserDto dto = lista.get(i);
            System.out.println(dto.getID() + "\t" + dto.getName() + "\t"
                    + dto.getAge() + "\t" + dto.getJoindate());
        } 
        
        System.out.print("삭제할 ID 입력: ");
        String id = sc.next();
        UserDto uDto = ut.search(id);
        if (uDto != null)
        {
            System.out.println("ID: " + uDto.getID());
            System.out.println("NAME: " + uDto.getName());
            System.out.println("AGE: " + uDto.getAge());
            System.out.println("JOINDATE: " + uDto.getJoindate());
        }
        else
        {
            System.out.println(id + "는 존재하지 않는 ID입니다.");
        }
           
        ut.del(id);
        
        System.out.println("모든 정보 목록");
        System.out.println("아이디\t이름\t나이\t가입일");

        List<UserDto> list = ut.userList();
        for (int i = 0; i < list.size(); i++)
        {
            UserDto dto = list.get(i);
            System.out.println(dto.getID() + "\t" + dto.getName() + "\t"
                    + dto.getAge() + "\t" + dto.getJoindate());
        } 
        
    }
    
    private List<UserDto> userList(){
        Connection conn = null;
        Statement stmt = null;
        
        conn = makeConnection();
        
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
                try{
                        if(stmt != null){
                                stmt.close();
                        }
                        if(conn != null){
                                conn.close();
                        }
                }catch(SQLException e){
                        e.printStackTrace();
                }
        }
        
        return list;
}
    
    private UserDto search(String id)
    {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        conn = makeConnection();
        
        UserDto userDto = null;
        
        // 쿼리
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
            try
            {
                if (stmt != null)
                {
                    stmt.close();
                    
                }
                if (conn != null)
                {
                    conn.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        return userDto;
    }
    private void del(String id)
    {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        conn = makeConnection();
        
        String sql = "DELETE \n";
        sql += "FROM MYTABLE\n";
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
            try
            {
                if (stmt != null)
                {
                    stmt.close();
                    
                }
                if (conn != null)
                {
                    conn.close();
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
       
    }
    
}
