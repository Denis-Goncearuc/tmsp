package Lab2.Bridge;

public class M16 extends Gun // concrete abstraction B
{
    M16(Ammo ammo)
    {
        super(ammo);
    }

    @Override
    void Shoot()
    {
        System.out.println("M16 shot a " + ammo.ammoType());
    }
}
