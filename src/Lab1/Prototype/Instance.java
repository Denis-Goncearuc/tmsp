package Lab1.Prototype;

public abstract class Instance
{
    public int posX;
    public int posY;
    public int posZ;

    public void MoveTo(int newX, int newY, int newZ)
    {
        this.posX = newX;
        this.posY = newY;
        this.posZ = newZ;
    }

    public void DisplayPosition()
    {
        System.out.println("This object is at \nx:" + posX + "\ny:" + posY + "\nz:" + posZ);
    }

    public abstract Instance Clone();
}
