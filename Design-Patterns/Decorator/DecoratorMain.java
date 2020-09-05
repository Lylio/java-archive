public class DecoratorMain {
    public static void main(String args[])
{
    Shape pentagon = new Pentagon();

    //implement red shape decorator on pentagon and decagon
    Shape redPentagon = new RedShapeDecorator(new Pentagon());

    Shape redDecagon = new RedShapeDecorator(new Decagon());

    pentagon.draw();
    redPentagon.draw();
    redDecagon.draw();
}

}