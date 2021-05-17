package Lab2.Decorator;

public class LuxuryCar extends TransportDecorator
{
    public LuxuryCar(Transport transport)
    {
        super(transport);
    }

    public String ApplyLuxuryCondition()
    {
        return ", in comfort";
    }

    @Override
    public String Move()
    {
        return super.Move() + ApplyLuxuryCondition();
    }
}
