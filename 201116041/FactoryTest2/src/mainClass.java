import java.util.LinkedList;
import java.util.Scanner;;
public class mainClass
{
    
    public static void main(String[] args)
    {
     /*  System.out.println("Factory");
       
       BtypeClass ac  =new BtypeClass();
       Person cMan =new Person();
       
       cMan.Create(ac);
        cMan.m_WeaPon.DrawWeapon();
        cMan.m_Bomb.DrawBomb();
       */ 
        
        
        //Atype / Btype
        
        //List 
        LinkedList<Person> list = new LinkedList<Person>();
        AbstractWeapon ac;
        Person cMan;
    
            ac =new AtypeClass(); 
            cMan =new Person(); 
            cMan.Create(ac);
            cMan.m_WeaPon.DrawWeapon();
            cMan.m_Bomb.DrawBomb();
            list.add(cMan);
            
            
            ac  =new BtypeClass(); 
            cMan =new Person(); 
            cMan.Create(ac);
            cMan.m_WeaPon.DrawWeapon();
            cMan.m_Bomb.DrawBomb();
            list.add(cMan);
 
       
      
    }
    
}
