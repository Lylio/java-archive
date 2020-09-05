public class ShapeFactory {

    public ShapeType getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("square")) {
            return new Octagon();
        } else if(shapeType.equalsIgnoreCase("circle")) {
            return new Rhombus();
        } else if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Oval();
        } else if(shapeType == null) {
            return null;
        } else {
            return null;
        }
    }
}
