import java.util.Scanner;

/** 
 * P3.4 Write a program that reads three numbers and prints “all the same” if they are all the
 * same, “all different” if they are all different, and “neither” otherwise.
 * @author Lyle
 *
 */
public class P3_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Please enter third number: ");
		int num3 = in.nextInt();
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("They are all the same.");
		} else if (num1 != num2 && num2 != num3) {
			System.out.println("They are all different.");
		} else {
			System.out.println("Neither all different, nor all same.");
		}
		
		in.close();
	}

}
