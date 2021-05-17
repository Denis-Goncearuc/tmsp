package Lab1.AbstarctFactory;

public class Main
{
    public static void main(String[] args)
    {
        TreeSpawner northForest = new WinterForrest();
        ForestGenerator generator = new ForestGenerator(northForest);
        generator.Status();

        TreeSpawner southForest = new SummerForrest();
        ForestGenerator generator1 = new ForestGenerator(southForest);
        generator1.Status();

    }
}
