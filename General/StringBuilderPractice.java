
/**
 * Practice with StringBuilder. This program reverses a string and replaces the vowels with asterisks
 * @author Lyle
 *
 */
public class StringBuilderPractice {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Workers of the world, unite!");
		sb = sb.reverse();
		System.out.println(sb.toString());
		sb = sb.reverse(); //Correct string direction
		
		for(int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if(c == 'a' || c == 'A' || 
			   c == 'e' || c == 'o' ||
			   c == 'i' || c == 'I' ||
			   c == 'o' || c == 'O' ||
			   c == 'u' || c == 'U' ) {
				sb.setCharAt(i, '*');
			}
		}
		System.out.println(sb.toString());
	}

}
