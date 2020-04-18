import java.util.Scanner;

/** P3.7 Write a program that reads in three integers and prints “in order” if they are sorted in
ascending or descending order, or “not in order” otherwise. For example,
1 2 5 in order
1 5 2 not in order
5 2 1 in order
1 2 2 in order
 * @author Lyle
 *
 */
public class P3_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Please enter third number: ");
		int num3 = in.nextInt();

		if(num3 > num2 && num2 > num1) {
			System.out.println("In order.");
		} else if(num3 < num2 && num2 < num1) {
			System.out.println("In order.");
		} else {
			System.out.println("Not in order.");
		}
		
		in.close();
	}

}
