
/**
 * P8.12 Write a class Bug that models a bug moving along a horizontal line. The bug moves
 * either to the right or left. Initially, the bug moves to the right, but it can turn to
 * change its direction. In each move, its position changes by one unit in the current
 * direction. Provide a constructor
 * public Bug(int initialPosition)
 * and methods
 * � public void turn()
 * � public void move()
 * � public int getPosition()
 * Sample usage:
 * Bug bugsy = new Bug(10);
 * bugsy.move(); // Now the position is 11
 * bugsy.turn();
 * bugsy.move(); // Now the position is 10
 * Your main method should construct a bug, make it move and turn a few times, and
 * print the actual and expected positions.
 * @author Lyle
 *
 */
public class P8_12 {

	public static void main(String[] args) {
		
		Bug beetle = new Bug(5);
		beetle.move();
		beetle.move();
		beetle.move();
		beetle.move();
		beetle.move();
		beetle.move();
		beetle.turn();
		beetle.move();
		beetle.move();
		beetle.move();
		System.out.println(beetle.getPosition()); //should be 8
	}

}
