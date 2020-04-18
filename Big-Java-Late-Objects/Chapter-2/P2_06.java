import java.util.Scanner;
/**
 * P2.6 Write a program that prompts the user for a measurement in meters and then converts
 * it to miles, feet, and inches.
 * @author Lyle
 *
 */
public class P2_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter measurement in meters: ");
		double measurement = in.nextDouble();
		in.close();
		
		mile(measurement);
		feet(measurement);
		inch(measurement);
		
	}
	
	public static double mile(double metres) {
		final double METERS_IN_MILE = 1609.34;
		double total = metres / METERS_IN_MILE;
		System.out.printf("Measurement in miles = %.2f\n", total);
		return total;
	}
	
	public static double feet(double metres) {
		final double METERS_IN_FOOT = 0.3048;
		double total = metres / METERS_IN_FOOT;
		System.out.printf("Measurement in feet = %.2f\n", total);
		return total;
	}
	
	public static double inch(double metres) {
		final double METERS_IN_INCH = 0.0254;
		double total = metres / METERS_IN_INCH;
		System.out.printf("Measurement in inches = %.2f\n", total);
		return total;
	}

}
