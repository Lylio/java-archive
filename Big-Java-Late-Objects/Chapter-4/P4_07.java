import java.util.Random;
import java.util.Scanner;

/** 
 * P4.7 Translate the following pseudocode for randomly permuting the characters in a
 * string into a Java program.
 * Read a word.
 * Repeat word.length() times
 * Pick a random position i in the word, but not the last position.
 * Pick a random position j > i in the word.
 * Swap the letters at positions j and i.
 * Print the word.
 * To swap the letters, construct substrings as follows:
 * @author Lyle
 *
 */
public class P4_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter word: ");
        String word = in.next();
        in.close();

        Random random = new Random();
        for (int times = 0; times < word.length(); times++) {
            int i = random.nextInt(word.length() - 1);
            int j = random.nextInt(word.length() - i - 1) + i + 1;
            String first = word.substring(0, i);
            String middle = word.substring(i + 1, j);
            String last = word.substring(j + 1);

            word = first + word.charAt(i) + middle + word.charAt(j) + last;
        }

        System.out.printf("New word is: \"%s\"", word);
			
		}

	}


