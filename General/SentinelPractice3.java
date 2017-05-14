import java.util.Scanner;
import java.util.ArrayList;

/**Sentinel practice using boolean instead of break statement
 * @author Lyle
 *
 */
public class SentinelPractice3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		boolean hasQuit = false;
		
		System.out.println("Please enter a list of days ('QUIT' to quit): ");
		while(!hasQuit) {
			String currentWord = in.next();
			currentWord = currentWord.toLowerCase();
			if(currentWord.equals("quit")) {
				hasQuit = true;
			} else {
				list.add(currentWord);
			}
			
		}
		
		for(String i : list) {System.out.print(i + ", ");}
		in.close();
	}

}
