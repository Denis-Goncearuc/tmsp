package Lab3.Command;

public class SquareCommand implements Command
{
    ShapeMaker shapeMaker;

    public SquareCommand(ShapeMaker shapeMaker)
    {
        this.shapeMaker = shapeMaker;
    }

    @Override
    public void Execute()
    {
        shapeMaker.DrawSquare();
    }
}

