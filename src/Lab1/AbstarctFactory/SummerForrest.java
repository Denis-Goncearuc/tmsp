package Lab1.AbstarctFactory;

public class SummerForrest implements TreeSpawner
{
    @Override
    public Tree CreateTree()
    {
        return new AppleTree();
    }

    @Override
    public Season CreateSeason()
    {
        return new SummerSeason();
    }
}
