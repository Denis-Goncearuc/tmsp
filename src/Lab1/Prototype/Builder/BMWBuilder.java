package Lab1.Prototype.Builder;

public class BMWBuilder extends CarAssembler
{

    @Override
    public void SetEngine()
    {
        carProduct.enginePow = 2.2f;
    }

    @Override
    public void SetChassis()
    {
        carProduct.type = "Sedan";
    }

    @Override
    public void SetWheels()
    {
        carProduct.diameter = 1.5f;
    }

    @Override
    public void SetColor()
    {
        carProduct.color = "Red";
    }
}
