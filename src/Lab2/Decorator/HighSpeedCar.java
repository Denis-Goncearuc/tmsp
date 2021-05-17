package Lab2.Decorator;

public class HighSpeedCar extends TransportDecorator
{
    public HighSpeedCar(Transport transport)
    {
        super(transport);
    }

    public String ApplyHighSpeed()
    {
        return ", at high speed";
    }

    @Override
    public String Move()
    {
        return super.Move() + ApplyHighSpeed();
    }

}
