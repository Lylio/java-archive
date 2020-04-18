import java.util.Scanner;
/**
 * P4.9 Write a program that reads a word and prints the word in reverse. For example, if the
 * user provides the input "Harry", the program prints
 * yrraH
 * @author Lyle
 *
 */
public class P4_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter word: ");
		String word = in.nextLine();
		in.close();
		
		printReverse(word);

	}
	public static void printReverse(String word) {
		for(int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
}
