
 /**
  * P5.6 Write a method
  * public static int countVowels(String str)
  * that returns a count of all vowels in the string str. Vowels are the letters a, e, i, o, and
  * u, and their uppercase
  * variants.
 * @author Lyle
 *
 */
public class P5_06 {

	public static void main(String[] args) {
		
		System.out.println(countVowels("Balaclava"));

	}
	
	public static int countVowels(String str) {
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
			   str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
			   str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
			   str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
			   str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				count++;
			}
		} return count;
	}

}
