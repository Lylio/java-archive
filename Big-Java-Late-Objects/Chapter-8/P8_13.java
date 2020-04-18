
/**
 * P8.13 Implement a class Moth that models a moth flying in a straight line. The moth has a
 * position, the distance from a fixed origin. When the moth moves toward a point of
 * light, its new position is halfway between its old position and the position of the
 * light source. Supply a constructor
 * public Moth(double initialPosition)
 * and methods
 * • public void moveToLight(double lightPosition)
 * • public void getPosition()
 * Your main method should construct a moth, move it toward a couple of light sources,
 * and check that the moth’s position is as expected.
 * @author Lyle
 *
 */
public class P8_13 {

	public static void main(String[] args) {
		
		Moth emporer = new Moth(25);
		emporer.getLightPosition(); //300
		
		emporer.getPosition(); //Should be 25
		emporer.moveToLight();
		emporer.getPosition(); //Should be 162.5
		
		emporer.moveToLight();
		emporer.getPosition(); //Should be 231.25
	
		
		

	}

}
