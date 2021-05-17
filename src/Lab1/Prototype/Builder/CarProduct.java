package Lab1.Prototype.Builder;

public class CarProduct
{
    protected float enginePow;
    protected String type;
    protected float diameter;
    protected String color;

    public void DisplayInfo()
    {
        System.out.println(enginePow + "\n" + type  + "\n" + diameter + "\n" + color);
    }
}
