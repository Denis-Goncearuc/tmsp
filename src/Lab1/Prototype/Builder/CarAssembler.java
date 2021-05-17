package Lab1.Prototype.Builder;

public abstract class CarAssembler
{
    protected CarProduct carProduct;

    public void newCarProduct()
    {
        carProduct = new CarProduct();
    }

    public abstract void SetEngine();
    public abstract void SetChassis();
    public abstract void SetWheels();
    public abstract void SetColor();


}
