import java.util.Scanner;
/**
 * P4.8 Write a program that reads a word and prints each character of the word on a separate
 * line. For example, if the user provides the input "Harry", the program prints
 * H
 * a
 * r
 * r
 * y
 * @author Lyle
 */
public class P4_08 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter word: ");
		String word = in.nextLine();
		in.close();
		
		printVertical(word);
		

	}

	public static void printVertical(String word) {
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}
