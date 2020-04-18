
/**
 * P9.10 The Rectangle class of the standard Java library does not supply a method to compute
the area or the perimeter of a rectangle. Provide a subclass BetterRectangle of the
Rectangle class that has getPerimeter and getArea methods. Do not add any instance
variables. In the constructor, call the setLocation and setSize methods of the Rectangle
class. Provide a program that tests the methods that you supplied.
 * @author Lyle
 *
 */
public class P9_10 {

	public static void main(String[] args) {
		
		BetterRectangle r1 = new BetterRectangle(0, 0, 4, 7);
		System.out.println(r1.toString());

	}

}
