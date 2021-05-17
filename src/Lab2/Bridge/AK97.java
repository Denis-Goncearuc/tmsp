package Lab2.Bridge;

public class AK97 extends Gun // concrete abstraction C
{
    AK97(Ammo ammo)
    {
        super(ammo);
    }

    @Override
    void Shoot()
    {
        System.out.println("AK97 shot a " + ammo.ammoType());
    }
}
