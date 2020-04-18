
/**
 * P4.13 Write a program that prints all powers of 2 from 20 up to 220.
 * @author Lyle
 *
 */
public class P4_13 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 20; i++) {
			System.out.println("2 to the power of " + i + " = " + (int)Math.pow(2, i));
		}
		
	}

}
