
/**
 * P2.1 Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet
 * of paper in millimeters. There are 25.4 millimeters per inch. Use constants
 * and comments in your program.
 * @author Lyle
 *
 */
public class P2_01 {

	public static void main(String[] args) {
		final double MILL_PER_INCH = 25.4; //Millimeters in one inch
		double letterWidth = 8.5;
		double letterLength = 11;
		
		System.out.printf("Length in mm = %.2f\n", letterLength * MILL_PER_INCH);
		System.out.printf("Width in mm = %.2f", letterWidth * MILL_PER_INCH);

	}

}
