package Lab2.Proxy;

public class ConcreteImage implements Image
{
    String file;
    ConcreteImage(String file)
    {
        this.file = file;
        Load();
    }

    public void Load()
    {
        System.out.println("Image loaded : " + file);
    }

    @Override
    public void Display()
    {
        System.out.println("Image displayed : " + file);
    }
}
