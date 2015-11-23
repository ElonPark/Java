package userCoffee;


public class UserDto
{
    private String id;
    private String passwd;
    

    private String name;
    
    private String birth;
    
    private String joindate;
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPasswd()
    {
        return passwd;
    }

    public void setPasswd(String passwd)
    {
        this.passwd = passwd;
    }
   
    
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getBirth()
    {
        return birth;
    }

    public void setBirth(String birth)
    {
        this.birth = birth;
    }

    public String getJoindate()
    {
        return joindate;
    }
    
    public void setJoindate(String joindate)
    {
        this.joindate = joindate;
    }
    
}
