
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
		
		int charLocation = sentence.indexOf('a');
		System.out.println(charLocation); //20 expected
		
		int charLocation2 = sentence.indexOf('a', 22);
		System.out.println(charLocation2); //24 expected as search starts from index 22
		
		
		//additional charAt practice
		char myChar = sentence.charAt(8);
		System.out.println(myChar); // y expected
	}

}
