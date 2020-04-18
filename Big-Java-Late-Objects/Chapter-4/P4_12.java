import java.util.Scanner;

/**
 * P4.12 Write a program that reads a word and prints all substrings, sorted by length. For
 * example, if the user provides the input "rum", the program prints
 * r
 * u
 * m
 * ru
 * um
 * rum
 * @author Lyle
 *
 */
public class P4_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter word: ");
		String word = in.nextLine();
		in.close();
		
		allSubstrings(word);

	}
	
	public static void allSubstrings(String word) {
		int wordLength = word.length();
		for(int i = 0; i < wordLength; i++) {
			for (int j = 0; j < word.length() - i; j++) {
                System.out.println(word.substring(j, j + i + 1));
				}
		}

	}
	
}
