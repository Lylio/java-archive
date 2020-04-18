import java.util.Scanner;
/**
 * P2.10 Write a program that helps a person decide whether to buy a hybrid car.
 * @author Lyle
 *
 */
public class P2_10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter car model: ");
		String model = in.nextLine();
		System.out.printf("Please enter cost of a new %s: ", model);
		int carPrice = in.nextInt();
		System.out.print("Please enter miles driven per year: ");
		int milesPerYear = in.nextInt();
		System.out.print("Please enter gas price (dollars per gallon): ");
		double gasPrice = in.nextDouble();
		System.out.print("Please enter gas efficiency (miles per gallon): ");
		double mpg = in.nextDouble();
		System.out.print("Please enter length of ownership (years): ");
		int ownership = in.nextInt();
		System.out.printf("Please enter resale value after %d years: ", ownership);
		int resaleValue = in.nextInt();
		in.close();
		
		double gasCost = gasCost(milesPerYear, ownership, gasPrice, mpg);
		double finalCost = (carPrice + gasCost) - resaleValue;
		System.out.println("----------------------------------------");
		System.out.printf("Total cost of a %s over %d years is: $%.2f", model, ownership, finalCost);
		
	}
	


	public static double gasCost(int miles, int ownership, double gasPrice, double mpg) {
		int tempMiles = miles * ownership;
		double total = (tempMiles / mpg) * gasPrice;
		return total;
	}

		
	
}
