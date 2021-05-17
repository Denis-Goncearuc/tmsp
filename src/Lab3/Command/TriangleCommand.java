package Lab3.Command;

public class TriangleCommand implements Command
{
    ShapeMaker shapeMaker;

    public TriangleCommand(ShapeMaker shapeMaker)
    {
        this.shapeMaker = shapeMaker;
    }

    @Override
    public void Execute()
    {
        shapeMaker.DrawTriangle();
    }
}
