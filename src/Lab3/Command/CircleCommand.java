package Lab3.Command;

public class CircleCommand implements Command
{
    ShapeMaker shapeMaker;

    public CircleCommand(ShapeMaker shapeMaker)
    {
        this.shapeMaker = shapeMaker;
    }

    @Override
    public void Execute()
    {
        shapeMaker.DrawCircle();
    }
}
