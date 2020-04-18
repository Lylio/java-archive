import java.util.Scanner;
/**
 * P2.11 Write a program that asks the user to input
 * • The number of gallons of gas in the tank
 * • The fuel efficiency in miles per gallon
 * • The price of gas per gallon
 * Then print the cost per 100 miles and how far the car can go with the gas in the tank.
 * @author Lyle
 *
 */
public class P2_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter gallons of gas in tank: ");
		int currentGas = in.nextInt();
		System.out.println("Please enter fuel efficiency in miles per gallon: ");
		int mpg = in.nextInt();
		System.out.println("Please enter cost of gas per gallon: ");
		double priceOfGas = in.nextDouble();
		in.close();
		
		cost100Miles(priceOfGas, mpg);
		distance(currentGas, mpg);
	}
	
	public static double cost100Miles(double priceOfGas, int mpg) {
		double total = (100 / (double)mpg) * priceOfGas;
		System.out.printf("Cost per 100 miles: $%.2f\n", total);
		return total;
	}
	
	public static double distance(int currentGas, int mpg) {
		double total = currentGas * mpg;
		System.out.printf("Maximum distance with %d gallons in tank: %.0f miles", currentGas, total);
		return total;
	}

}
