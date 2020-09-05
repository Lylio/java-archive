public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        ShapeType square = factory.getShape("square");
        square.draw();

        ShapeType circle = factory.getShape("circle");
        circle.draw();

    }
}
