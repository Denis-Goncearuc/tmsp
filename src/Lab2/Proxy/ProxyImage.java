package Lab2.Proxy;

public class ProxyImage implements Image
{
    String file;
    ConcreteImage image;

    ProxyImage(String file)
    {
        this.file = file;
    }


    @Override
    public void Display()
    {
        if(image == null)
        {
            image = new ConcreteImage(file);
        }
        image.Display();
    }
}
