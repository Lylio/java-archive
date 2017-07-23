
/**
 * Practice using the indexOf method on Strings
 * @author Lyle
 *
 */
public class StringIndexOfPractice {

	public static void main(String[] args) {
		
		String sentence = "Picture yourself on a boat on a river.";
		int indexLocation = sentence.indexOf("boat");
		System.out.println(indexLocation); //22 expected
		
		int charLocation = sentence.indexOf('u');
		System.out.println(charLocation); //4 expected
		
		
		//additional charAt practice
		char myChar = sentence.charAt(8);
		System.out.println(myChar); // y expected
	}

}
