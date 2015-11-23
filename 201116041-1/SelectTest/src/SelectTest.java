
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SelectTest
{
    
    public SelectTest()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading success!!");
        }
        catch (ClassNotFoundException e)
        {
            // TODO �ڵ� ������ catch ���
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
        SelectTest st = new SelectTest();
        
        // �˻�
        String id = "1112";
        System.out.println(id + " �˻� ���");
        UserDto uDto = st.search(id);
        
        if (uDto != null)
        {
            System.out.println("ID: " + uDto.getID());
            System.out.println("NAME: " + uDto.getName());
            System.out.println("AGE: " + uDto.getAge());
            System.out.println("JOINDATE: " + uDto.getJoindate());
        }
        else
        {
            System.out.println(id + "�� �������� �ʴ� ID�Դϴ�.");
        }
        
        // ��� ���� ����
        System.out.println("��� ���� ���");
        System.out.println("���̵�\t�̸�\t����\t������");
        List<UserDto> list = st.userList();
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
        
        // ����
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
                
                if (rs != null)
                {
                    rs.close();
                    
                }
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
    
}
