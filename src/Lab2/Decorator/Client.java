package Lab2.Decorator;

public class Client
{
    public static void main(String[] args)
    {
        Transport simpleTransport = new Car();
        Transport luxuryCar = new LuxuryCar(new Car());
        Transport sportCar = new HighSpeedCar(new Car());
        Transport superCar = new HighSpeedCar(new LuxuryCar(new Car()));

        System.out.println(simpleTransport.Move());
        System.out.println(luxuryCar.Move());
        System.out.println(sportCar.Move());
        System.out.println(superCar.Move());

    }
}
