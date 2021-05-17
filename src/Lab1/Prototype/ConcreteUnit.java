package Lab1.Prototype;

public class ConcreteUnit extends Instance
{

    public ConcreteUnit(){}

    public ConcreteUnit(ConcreteUnit target)
    {
        super();
        this.posX = target.posX;
        this.posY = target.posY;
        this.posZ = target.posZ;
    }

    @Override
    public Instance Clone()
    {
        return new ConcreteUnit(this);
    }


    public static void main(String[] args)
    {
        ConcreteUnit instance1 = new ConcreteUnit();
        instance1.posX = 1;
        instance1.posY = 1;
        instance1.posZ = 1;
        instance1.DisplayPosition();

        ConcreteUnit instance2 = (ConcreteUnit) instance1.Clone();
        instance2.DisplayPosition();
    }
}

