import java.util.Scanner;

/** 
 * P3.1 Write a program that reads an integer and prints whether it is negative, zero, or
 * positive.
 * @author Lyle
 *
 */
public class P3_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int num = in.nextInt();
		if(num < 0) {
			System.out.println("Number is negative.");
		} else if (num > 0) {
			System.out.println("Number is positive.");
		} else {
			System.out.println("Number is zero.");
		}
		
		in.close();
	}

}
