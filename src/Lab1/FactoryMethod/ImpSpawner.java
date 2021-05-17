package Lab1.FactoryMethod;

public class ImpSpawner extends Spawner
{
    @Override
    public Enemy SpawnEnemy()
    {
        return new Imp();
    }
}
