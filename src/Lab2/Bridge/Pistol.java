package Lab2.Bridge;

public class Pistol extends Gun // concrete abstraction a
{
    Pistol(Ammo ammo)
    {
        super(ammo);
    }

    @Override
    void Shoot()
    {
        System.out.println("Pistol shot a " + ammo.ammoType());
    }
}
