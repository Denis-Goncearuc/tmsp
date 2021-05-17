package Lab1.FactoryMethod;

public class Main
{
    public static void main(String[] args)
    {
        ImpSpawner impSpawner = new ImpSpawner();
        SlimeSpawner slimeSpawner = new SlimeSpawner();

        Enemy imp = impSpawner.SpawnEnemy();
        imp.Status();

        Enemy slime =  slimeSpawner.SpawnEnemy();
        slime.Status();
    }
}
