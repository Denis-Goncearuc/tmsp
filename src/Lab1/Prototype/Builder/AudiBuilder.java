package Lab1.Prototype.Builder;

public class AudiBuilder extends CarAssembler
{

    @Override
    public void SetEngine()
    {
        carProduct.enginePow = 2.6f;
    }

    @Override
    public void SetChassis()
    {
        carProduct.type = "Universal";
    }

    @Override
    public void SetWheels()
    {
        carProduct.diameter = 1.8f;
    }

    @Override
    public void SetColor()
    {
        carProduct.color = "Gray";
    }
}
