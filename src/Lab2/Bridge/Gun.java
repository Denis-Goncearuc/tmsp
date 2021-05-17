package Lab2.Bridge;

public abstract class Gun //abstaction
{
    Ammo ammo;
    Gun(Ammo ammo)
    {
        this.ammo = ammo;
    }

    abstract void Shoot();
}
