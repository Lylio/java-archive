public class ShapeMaker {

    private Rhombus rhombus;
    private Octagon octagon;
    private Oval oval;

    public ShapeMaker() {
        rhombus = new Rhombus();
        octagon = new Octagon();
        oval = new Oval();
    }

    public void drawRhombus()
    {
        rhombus.draw();
    }
    public void drawOctagon()
    {
        octagon.draw();
    }
    public void drawOval()
    {
        oval.draw();
    }

}