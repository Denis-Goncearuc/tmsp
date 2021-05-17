package Lab3.Command;

public class Client
{
    public static void main(String[] args)
    {
        ShapeMaker shapeMaker = new ShapeMaker();
        DrawApplication drawApplication = new DrawApplication(
                new CircleCommand(shapeMaker),
                new RectangleCommand(shapeMaker),
                new SquareCommand(shapeMaker),
                new TriangleCommand(shapeMaker)
        );

        drawApplication.DrawTriangle();
        drawApplication.DrawRectangle();
        drawApplication.DrawCircle();
        drawApplication.DrawSquare();
    }




}
