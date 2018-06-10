import java.util.Scanner;
/**
 * Practice with splitting strings
 * @author Lyle
 *
 */
public class SplitString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter address separated by commas: ");
		String address = in.nextLine();
		String[] addressElement = address.split(", ");
		
		System.out.println("The third element is " + addressElement[2]);
		
		for(String el : addressElement) {
			System.out.println("\n" + el);
		}
		
		in.close();
	}

}
