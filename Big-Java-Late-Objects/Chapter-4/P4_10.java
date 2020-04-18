import java.util.Scanner;

/**
 * P4.10 Write a program that reads a word and prints the number of vowels in the word. For
 * this exercise, assume that a e i o u y are vowels. For example, if the user provides
 * the
 * input "Harry", the program prints 2 vowels.
 * @author Lyle
 * 
 *
 */
public class P4_10 {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter word: ");
			String word = in.nextLine();
			in.close();
			
			vowelCount(word);

	}
	
	public static int vowelCount(String word) {
		int count = 0;
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A' ||
			   word.charAt(i) == 'e' || word.charAt(i) == 'E' ||
			   word.charAt(i) == 'i' || word.charAt(i) == 'I' ||
			   word.charAt(i) == 'o' || word.charAt(i) == 'O' ||
			   word.charAt(i) == 'u' || word.charAt(i) == 'U' ||
			   word.charAt(i) == 'y' || word.charAt(i) == 'Y') {
				count++;
			}
		}
		System.out.print(count + " vowels.");
		return count;
	}

}
