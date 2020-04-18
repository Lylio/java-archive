
 /**
  * P5.7 Write a method
  * public static int countWords(String str)
  * that returns a count of all words in the string str. Words are separated by spaces. For
  * example, countWords("
  * Mary had a little lamb") should return 5.
 * @author Lyle
 *
 */
public class P5_07 {

	public static void main(String[] args) {
		
		System.out.println(countWords("Start spreading the news, I'm leaving today"));
		
	}

	public static int countWords(String str) {
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		} return count;
	}
}
