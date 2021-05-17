package Lab1.AbstarctFactory;

public class ForestGenerator
{
    private Tree tree;
    private Season season;

    public ForestGenerator(TreeSpawner spawner)
    {
        tree = spawner.CreateTree();
        season = spawner.CreateSeason();
    }

    public void Status()
    {
        tree.Status();
        season.Status();
    }
}
