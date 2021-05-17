package Lab3.Command;


public class RectangleCommand implements Command
{
    ShapeMaker shapeMaker;

    public RectangleCommand(ShapeMaker shapeMaker)
    {
        this.shapeMaker = shapeMaker;
    }

    @Override
    public void Execute()
    {
        shapeMaker.DrawRectangle();
    }
}
