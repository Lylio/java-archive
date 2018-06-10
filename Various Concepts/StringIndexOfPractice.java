
/**
 * Practice using the indexOf method on Strings
 * @author Lyle
 *
 */
public class StringIndexOfPractice {

	public static void main(String[] args) {
		
		String sentence = "Picture yourself on a boat on a river.";
		int indexLocation = sentence.indexOf("on");
		System.out.println(indexLocation); //17 expected
		
		int charLocation = sentence.indexOf('a');
		System.out.println(charLocation); //20 expected
		
		int charLocation2 = sentence.indexOf('a', 22);
		System.out.println(charLocation2); //24 expected as search starts from index 22
		
		int indexLocation2 = sentence.lastIndexOf("on");
		System.out.println(indexLocation2); /*lastIndexOf searches right to left
											27 expected as the second "on" will be
											found first*/
		
		
		//additional charAt practice
		char myChar = sentence.charAt(8);
		System.out.println(myChar); // y expected
	}

}
