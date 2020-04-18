import java.util.Scanner;
/**
 * P4.17 Factoring of integers. Write a program that asks the user for an integer and then
 * prints out all its factors. For example, when the user enters 150, the program should
 * print
 * 2
 * 3
 * 5
 * 5
 * @author Lyle
 *
 */
public class P4_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int num = in.nextInt();
		in.close();
		
		int factor = 2;
		while(num > 1) {
			if (num % factor == 0) {
				System.out.println(factor);
				num = num / factor;
			}
			else {
				factor++;
			}


		}

	}

}
