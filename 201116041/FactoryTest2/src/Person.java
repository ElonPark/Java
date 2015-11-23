
public class Person
{
    Weapon m_WeaPon;
    
    Bomb m_Bomb;
    
    void Create(AbstractWeapon aw)
    {
        this.m_WeaPon = aw.CreateWeapon();
        this.m_Bomb = aw.CrasteBomb();
    }    
}
