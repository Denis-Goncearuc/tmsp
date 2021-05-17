package Lab1.AbstarctFactory;

public class WinterForrest implements TreeSpawner
{

    @Override
    public Tree CreateTree()
    {
        return new PineTree();
    }

    @Override
    public Season CreateSeason()
    {
        return new WinterSeason();
    }
}
