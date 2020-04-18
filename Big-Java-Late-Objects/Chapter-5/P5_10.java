import java.util.Scanner;
 /**
  * P5.10 Write a method
  * public static double readDouble(String prompt)
  * that displays the prompt string, followed by a space, reads a floating-point number
  * in, and returns it. Here is a typical usage:
  * salary = readDouble("Please enter your salary:");
  * percentageRaise = readDouble("What percentage raise would you like?");
 * @author Lyle
 *
 */
public class P5_10 {

	public static void main(String[] args) {
		
		double salary = readDouble("Enter the salary you would like: ");
		
		System.out.println("Your salary is now £" + salary);

	}

	public static double readDouble(String prompt) {
		Scanner in = new Scanner(System.in);
		System.out.println(prompt);
		double num = in.nextDouble();
		in.close();
		return num;

	}
}
