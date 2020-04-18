import java.util.Scanner;

/**
 * P2.5 Enhance the output of Exercise P2.4 so that the numbers are properly aligned
 * @author Lyle
 *
 */
public class P2_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = in.nextInt();
		in.close();
		
		System.out.println("\n------------------");//Line breaker
		sum(num1, num2);
		difference(num1, num2);
		product(num1, num2);
		average(num1, num2);
		distance(num1, num2);
		max(num1, num2);
		min(num1, num2);

		
	}
	
	//Methods: sum, difference, product, average, distance,
	//max, min
	
	public static int sum(int x, int y) {
		int total = x + y;
		System.out.printf("Total is: %8d\n", total);
		return total;
	}
	
	public static int difference(int x, int y) {
		int total;
		if(x > y) {total = x - y;}
		else {total = y - x;}
		System.out.printf("Difference is: %3d\n", total);
		return total;
	}
	
	public static int product(int x, int y) {
		int total = x * y;
		System.out.printf("Product is: %6d\n", total);
		return total;
	}
	
	public static double average(int x, int y) {
		double total = (double)(x + y) / 2;
		System.out.printf("Average is: %6.2f\n", total);
		return total;
	}
	
	public static int distance(int x, int y) {
		int temp = x - y;
		int total = Math.abs(temp);
		System.out.printf("Distance is: %5d\n", total);
		return total;
	}
	
	public static int max(int x, int y) {
		int total = Math.max(x, y);
		System.out.printf("Max is: %10d\n", total);
		return total;
	}
	
	public static int min(int x, int y) {
		int total = Math.min(x, y);
		System.out.printf("Max is: %10d\n", total);
		return total;

	}

}
