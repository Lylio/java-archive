import java.util.Scanner;

/**
 * P3.19 Write a program that reads in two floating-point numbers and tests whether they are
the same up to two decimal places. Here are two sample runs.
Enter two floating-point numbers: 2.0 1.99998
They are the same up to two decimal places.
Enter two floating-point numbers: 2.0 1.98999
They are different.
 * @author Lyle
 *
 */
public class P3_19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter to double numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        in.close();

        if(Math.abs(num1 - num2) < 0.01) {
            System.out.println("They are the same.");
        }
        else {
            System.out.println("They are different.");
        }

        
	}

}
