package Lab1.Prototype.Builder;

import javax.swing.*;

public class CarFactory
{
    private CarAssembler carAssembler;
    public void SetCarBuilder(CarAssembler carAssembler)
    {
        this.carAssembler = carAssembler;
    }

    public void Build()
    {
        carAssembler.newCarProduct();
        carAssembler.SetChassis();
        carAssembler.SetEngine();
        carAssembler.SetColor();
        carAssembler.SetWheels();
        carAssembler.carProduct.DisplayInfo();
    }


    public static void main(String[] args)
    {
        CarFactory factory = new CarFactory();
        BMWBuilder BMW = new BMWBuilder();
        factory.SetCarBuilder(BMW);
        factory.Build();

        MercedesBuilder mercedes = new MercedesBuilder();
        factory.SetCarBuilder(mercedes);
        factory.Build();
    }
}
