import java.util.Scanner;
/**
 * P2.16 Write a program that reads in an integer and breaks it into a sequence of individual
 * digits.
 * @author Lyle
 *
 */
public class P2_16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num = in.nextInt();
		in.close();
		
		String number = String.valueOf(num); //convert integer to string
		char[] charArray = number.toCharArray(); //add each character of string to an array
		for(int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]); //print each character in array
		}
		
		

	}

}
