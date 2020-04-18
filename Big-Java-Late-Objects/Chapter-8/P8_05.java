
/**
 * P8.5 Implement a class SodaCan with methods getSurfaceArea() and getVolume().
 * In the constructor, supply the height and radius of the can.
 * @author Lyle
 *
 */
public class P8_05 {

	public static void main(String[] args) {
		
		SodaCan pepsi = new SodaCan(12.0, 3.0);
		
		System.out.printf("Surface area: %.2fcm", pepsi.getSurfaceArea());
		System.out.printf("\nVolume: %.2fcm", pepsi.getVolume());

	}

}
