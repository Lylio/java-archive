import java.util.Scanner;

/**
 * P3.9 Write a program that reads a temperature value and the letter C for Celsius or F for
 * Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature
 * at sea level.
 * @author Lyle
 *
 */
public class P3_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int CEL_FREEZE = 0;
		final int CEL_BOIL = 100;
		final int FAR_FREEZE = 32;
		final int FAR_BOIL = 212;
		
		System.out.print("Please enter temperature: ");
		double temperature = in.nextDouble();
		System.out.println("Celsuis or Farenheit? C/F: ");
		String scale = in.next();
		scale = scale.toUpperCase();
		
		if(scale.equals("C")) {
			if(temperature <= CEL_FREEZE) {
				System.out.println("Solid");
			} else if(temperature > CEL_FREEZE && temperature < CEL_BOIL) {
				System.out.println("Liquid");
			} else {System.out.println("Gas");}
		} else {
			if(temperature <= FAR_FREEZE) {
				System.out.println("Solid");
			} else if(temperature > FAR_FREEZE && temperature < FAR_BOIL) {
				System.out.println("Liquid");
			} else {System.out.println("Gas");}
		}
	in.close();
	}

}



