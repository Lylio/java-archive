import java.util.Scanner;
import java.util.ArrayList;

/**Sentinel practice where specific word exits loop
 * @author Lyle
 *
 */
public class SentinelPractice2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a list of colours ('QUIT' to quit): ");
		while(in.hasNextLine()) {
			String currentWord = in.next();
			currentWord = currentWord.toLowerCase();
			//REMEMBER: the sentinel should be the first condition of the loop, otherwise
			//the sentinel word gets added to the array
			if(currentWord.equals("quit")) {
				break;
			} else {
				list.add(currentWord);

			}

		}

		in.close();
		System.out.println(list);

	}

}
