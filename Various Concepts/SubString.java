import java.util.Scanner;
/**
 * Practice with substring method
 * @author Lyle
 *
 */
public class SubString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String sentence = null;
		int index1 = 0;
		int index2 = 0;
		
		System.out.print("Please enter a sentence: ");
		sentence = in.nextLine();
		System.out.print("Please enter first index: ");
		index1 = in.nextInt();
		System.out.print("Please enter second index: ");
		index2 = in.nextInt();
		in.close();
		
		System.out.println("Substring is: " + sentence.substring(index1, index2));
		
	}

}
