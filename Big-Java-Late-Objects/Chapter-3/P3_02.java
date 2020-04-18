import java.util.Scanner;

/** 
 * P3.2 Write a program that reads a floating-point number and prints “zero” if the number
 * is zero. Otherwise, print “positive” or “negative”. Add “small” if the absolute value
 * of the number is less than 1, or “large” if it exceeds 1,000,000.
 * @author Lyle
 *
 */
public class P3_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter floating point number: ");
		double num = in.nextDouble();
		
		if(num < 0) {
			System.out.println("Negative");
		} else if(num > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Zero");
		}
		
		if(Math.abs(num) < 1 && num != 0) {
			System.out.println("Small");
		} else if(num > 1000000) {
			System.out.println("Large");
		}
		
		in.close();
	}

}
