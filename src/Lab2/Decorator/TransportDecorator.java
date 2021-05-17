package Lab2.Decorator;

public class TransportDecorator implements Transport
{
    Transport transport;

    public TransportDecorator(Transport transport)
    {
        this.transport = transport;
    }

    @Override
    public String Move()
    {
        return transport.Move();
    }
}
