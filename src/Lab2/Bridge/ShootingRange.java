package Lab2.Bridge;

public class ShootingRange //Client
{
    public static void main(String[] args)
    {
        Pistol pistol = new Pistol(new Round0_45());
        M16 m16 = new M16(new Round5_56());
        AK97 ak97 = new AK97(new Round7_76());

        pistol.Shoot();
        m16.Shoot();
        ak97.Shoot();
    }
}
