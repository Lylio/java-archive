import java.util.Scanner;

/**
 * P4.6 Translate the following pseudocode for finding the minimum value from a set of
 * inputs into a Java program.
 * Set a Boolean variable "first" to true.
 * While another value has been read successfully
 * If first is true
 * Set the minimum to the value.
 * Set first to false.
 * Else if the value is less than the minimum
 * Set the minimum to the value.
 * Print the minimum.
 * @author Lyle
 *
 */
public class P4_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean first = true;
		int minimum = Integer.MAX_VALUE;
		System.out.print("Please enter numbers ('q' to quit): ");
		while(in.hasNextInt()) {
			int current = in.nextInt();
			if(first) {
				minimum = current;
				first = false;
			} else if (current < minimum) {
				minimum = current;
			}
		}
		System.out.printf("\nMinimum value is %d", minimum);
        in.close();

	}

}
