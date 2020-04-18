import java.util.Scanner;

/**Write a program that reads in three floating-point numbers and prints the largest of
the three inputs. For example:
Please enter three numbers: 4 9 2.5
The largest number is 9.
 * @author Lyle
 *
 */
public class P3_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		double num1 = in.nextDouble();
		System.out.print("Please enter second number: ");
		double num2 = in.nextDouble();
		System.out.print("Please enter third number: ");
		double num3 = in.nextDouble();
		in.close();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		} else if(num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);
		} else if(num3 > num1 && num3 > num2) {
			System.out.println("The largest number is " + num3);
		} else {System.out.println("Largest number is a tie");}
	}

}
