import java.util.Scanner;
/**
 * P2.4 Write a program that prompts the user for two integers and then prints sum, difference, product, average, distance,
 * max, min
 * @author Lyle
 *
 */
public class P2_04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = in.nextInt();
		in.close();
		
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
		System.out.println("Total is: " + total);
		return total;
	}
	
	public static int difference(int x, int y) {
		int total;
		if(x > y) {total = x - y;}
		else {total = y - x;}
		System.out.println("Difference is: " + total);
		return total;
	}
	
	public static int product(int x, int y) {
		int total = x * y;
		System.out.println("Product is: " + total);
		return total;
	}
	
	public static double average(int x, int y) {
		double total = (double)(x + y) / 2;
		System.out.printf("Average is: %.2f\n", total);
		return total;
	}
	
	public static int distance(int x, int y) {
		int temp = difference(x, y);
		int total = Math.abs(temp);
		System.out.println("Distance is: " + total);
		return total;
	}
	
	public static int max(int x, int y) {
		int total = Math.max(x, y);
		System.out.println("Max is: " + total);
		return total;
	}
	
	public static int min(int x, int y) {
		int total = Math.min(x, y);
		System.out.println("Max is: " + total);
		return total;
	}

}
