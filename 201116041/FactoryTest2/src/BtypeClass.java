
public class BtypeClass implements AbstractWeapon
{

    public Weapon CreateWeapon()
    {
        return new Gun();
    }
    public Bomb CrasteBomb()
    {
        return new BBB();
    }
}
