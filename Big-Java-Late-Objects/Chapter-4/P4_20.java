import java.util.Scanner;
/**
 * P4.20 Write a program that reads an integer and displays, using asterisks, a filled and hollow
 * square, placed next to each other. For example if the side length is 5, the program
 * should display
 *   ***** *****
 *   ***** *   *
 *   ***** *   *
 *   ***** *   *
 *   ***** *****
 * @author Lyle
 *
 */
public class P4_20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = in.nextInt();
		in.close();
		
		asterisks(num);


	}
	
	public static void asterisks(int num) {
		String row1 = "***** *****";
		String row2 = "***** *   *";
		System.out.println(row1);
		for(int i = 1; i <= (num - 2); i++) {
			System.out.println(row2);
		} System.out.println(row1);
	}

}
