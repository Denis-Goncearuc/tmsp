package Lab2.Proxy;

public class ImageLoadeClient
{
    public static void main(String[] args)
    {
        Image image1 = new ConcreteImage("picture.jpg");
        //image1.Display();
        Image image2 = new ProxyImage("picture.jpg");
        image2.Display();
    }
}
