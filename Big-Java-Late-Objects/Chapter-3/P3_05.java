import java.util.Scanner;

/**
 * P3.5 Write a program that reads three numbers and prints “increasing” if they are in
 * increasing order, “decreasing” if they are in decreasing order, and “neither” otherwise.
 * Here, “increasing” means “strictly increasing”, with each value larger than its
 * predecessor.
 * The sequence 3 4 4 would not be considered increasing.
 * @author Lyle
 *
 */
public class P3_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Please enter third number: ");
		int num3 = in.nextInt();
		
		if(num3 > num2 && num2 > num1) {
			System.out.println("Increasing.");
		} else if(num1 > num2 && num2 > num3) {
			System.out.println("Decreasing.");
		} else {
			System.out.println("Neither increasing nor decreasing.");
		}
		in.close();
	}

}
