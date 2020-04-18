import java.util.Scanner;
/**
 * Write a program that reads an integer and displays, using asterisks, a filled diamond
of the given side length. For example, if the side length is 4, the program should display
   *
  ***
 *****
*******
 *****
  ***
   *
 * @author Lyle
 *
 */
public class P4_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = in.nextInt();
		in.close();

		diamond(num);
		
	}
	
	public static void diamond(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < i; j +=2) {
				System.out.println("*");
			}
		}
	}

}
