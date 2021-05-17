package Lab1.Singleton;


public class ExampleClass
{
    private static ExampleClass INSTANCE;
    private ExampleClass(){}
    public ExampleClass GetInstance()
    {
        if(INSTANCE == null)
           INSTANCE =  new ExampleClass();
        return INSTANCE;
    }
    //most simple way

}
