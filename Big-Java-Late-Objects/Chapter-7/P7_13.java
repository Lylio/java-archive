import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * P7.13 Write a program that asks the user to input a set of floating-point values. When the
 * user enters a value that is not a number, give the user a second chance to enter the
 * value. After two chances, quit reading input. Add all correctly specified values and
 * print the sum when the user is done entering data. Use exception handling to detect
 * improper inputs.
 * @author Lyle
 *
 */
public class P7_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double total = 0;
		int tries = 2;
		
		System.out.println("Please enter floating-point values (-1.00 to exit): ");
		while(tries >= 0) {
			try {
				double currentNum = in.nextDouble();
				if(currentNum == -1.00) {
					break;
				} else {
					total += currentNum;
				}
				
			} catch(InputMismatchException e) {
				System.out.println("Error - please enter a floating-point number: ");
				tries--;
				in.next();
			}
		}
		
		System.out.printf("\nTotal = %.2f", total);
		in.close();
		
	

	}

}
