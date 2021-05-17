package Lab3.Command;

public class DrawApplication
{
    Command drawCircle;
    Command drawSquare;
    Command drawRectangle;
    Command drawTriangle;

    public DrawApplication(Command drawCircle, Command drawRectangle, Command drawSquare, Command drawTriangle)
    {
        this.drawCircle = drawCircle;
        this.drawTriangle = drawTriangle;
        this.drawSquare = drawSquare;
        this.drawRectangle = drawRectangle;
    }

    public void DrawCircle()
    {
        drawCircle.Execute();
    }
    public void DrawRectangle()
    {
        drawRectangle.Execute();
    }
    public void DrawTriangle()
    {
        drawTriangle.Execute();
    }
    public void DrawSquare()
    {
        drawSquare.Execute();
    }



}
