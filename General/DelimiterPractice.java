import java.util.Scanner;
public class DelimiterPractice {

	public static void main(String[] args) {
		
		String sentence = "The inventor of Java was _James Gosling_";
		Scanner in = new Scanner(sentence);
		in.useDelimiter("_");
		String question = in.next();
		String answer = in.next();
		in.close();
		
		System.out.println(question);
		System.out.println(answer);

	}

}
