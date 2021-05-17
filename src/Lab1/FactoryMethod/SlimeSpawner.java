package Lab1.FactoryMethod;

public class SlimeSpawner extends Spawner
{
    @Override
    public Enemy SpawnEnemy()
    {
        return new BigSlime();
    }
}
