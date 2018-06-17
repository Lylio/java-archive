import java.util.Scanner;
import java.util.ArrayList;

/**
 * Converts an int number to a String, then adds the characters of the String to an
 * ArrayList
 * @author Lyle
 *
 */
public class ConvertIntegerToString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number: ");
		int number = in.nextInt();
		
		//Convert int to String
		String numToString = String.valueOf(number);
		
		//Add characters of String to an ArrayList
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0; i < numToString.length(); i++) {
			list.add(numToString.charAt(i));
		}
		
		System.out.println(list);
		in.close();
		
		
	}

}
