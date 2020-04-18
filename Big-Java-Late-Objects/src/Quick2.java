import java.util.Scanner;
/**
 * @author Lyle
 * Refresher of learning
 *
 */
public class Quick2 {

	public static void main(String[] args) {

		//Ask user for sentence
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter sentence: ");
		String sentence = in.nextLine();

		//Use vowel location method
		vowelLoc(sentence);

		in.close();


		}


		public static void vowelLoc(String str) {

			for(int i = 0; i < str.length(); i++) {
				char currentChar = str.charAt(i);
					if(currentChar == 'a' || currentChar == 'A' ||
					   currentChar == 'e' || currentChar == 'E' ||
					   currentChar == 'i' || currentChar == 'I' ||
					   currentChar == 'o' || currentChar == 'O' ||
					   currentChar == 'u' || currentChar == 'U') {
						
						System.out.print(i + " ");
				}

			}

		}
		
}


