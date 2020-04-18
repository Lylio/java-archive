import java.util.Scanner;

/**
 * P4.3 Write programs that read a line of input as a string and print
 * a. Only the uppercase letters in the string.
 * b. Every second letter of the string.
 * c. The string, with all vowels replaced by an underscore.
 * d. The number of vowels in the string.
 * e. The positions of all vowels in the string.
 * @author Lyle
 *
 */
public class P4_03 {

	public static void main(String[] args) {
		
		vowelPosition();

	}
	
	public static void upperCase() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter sentence: ");
		String sentence = in.nextLine();
		for(int i = 0; i < sentence.length() - 1; i++) {
			char temp = sentence.charAt(i);
			if(Character.isUpperCase(temp)) {
				System.out.print(temp + " ");
			} in.close();
		}
	}
	
	public static void secondLetter() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter sentence: ");
		String sentence = in.nextLine();
		for(int i = 0; i < sentence.length(); i += 2) {
			System.out.print(sentence.charAt(i) + " ");
		
		} in.close();
	}
	
	public static void underscore() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter sentence: ");
		String sentence = in.nextLine();
		for(int i = 0; i < sentence.length(); i++) {
			char currentChar = sentence.charAt(i);
			
			if(currentChar == 'a' || currentChar == 'A' ||
			   currentChar == 'e' || currentChar == 'E' ||
			   currentChar == 'i' || currentChar == 'I' ||
			   currentChar == 'o' || currentChar == 'O' ||
			   currentChar == 'u' || currentChar == 'U') {
				System.out.print('_');
			} else {
				System.out.print(currentChar);
			} in.close();
			
		}
	}
	
	public static void vowelNumber() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter sentence: ");
		String sentence = in.nextLine();
		int count = 0;
		for(int i = 0; i < sentence.length(); i++) {
			char currentChar = sentence.charAt(i);
			
			if(currentChar == 'a' || currentChar == 'A' ||
			   currentChar == 'e' || currentChar == 'E' ||
			   currentChar == 'i' || currentChar == 'I' ||
			   currentChar == 'o' || currentChar == 'O' ||
			   currentChar == 'u' || currentChar == 'U') {
				count++;
				}
			
		} System.out.print(count + " vowels");
		in.close();
	}
	
	public static void vowelPosition() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter sentence: ");
		String sentence = in.nextLine();
		for(int i = 0; i < sentence.length(); i++) {
			char currentChar = sentence.charAt(i);
			
			if(currentChar == 'a' || currentChar == 'A' ||
			   currentChar == 'e' || currentChar == 'E' ||
			   currentChar == 'i' || currentChar == 'I' ||
			   currentChar == 'o' || currentChar == 'O' ||
			   currentChar == 'u' || currentChar == 'U') {
				System.out.print(i + " ");
			}
			
	} in.close();
		
}
	
}
