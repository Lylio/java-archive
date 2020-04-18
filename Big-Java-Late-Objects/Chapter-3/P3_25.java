import java.util.Scanner;

/**
 * P3.25 Write a program that prompts the user to provide a single character from the alphabet. 
 * Print Vowel or Consonant, depending on the user input. If the user input is
 * not a letter (between a and z or A and Z), or is a string of length > 1, print an error
 * message.
 * @author Lyle
 *
 */
public class P3_25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a character: ");
		String userChar = in.nextLine();
		userChar = userChar.toLowerCase();
		in.close();
		

		if(userChar.length() == 1 && Character.isLetter(userChar.charAt(0))) {
		
			if(userChar.equals("a") || userChar.equals("e") ||
		       userChar.equals("i") || userChar.equals("o") ||	
		       userChar.equals("u")) {System.out.println("Vowel");
			 } else {System.out.println("Consonant");} 
		
		} else {System.out.println("Error input");}
	
	}
}
