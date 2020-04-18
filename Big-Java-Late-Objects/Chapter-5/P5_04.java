
 /**
  * P5.4 Write a method
  * public static String middle(String str)
  * that returns a string containing the middle character in str if the length of str is odd,
  * or the two middle characters if the length is even. For example, middle("middle")
  * returns "dd".
 * @author Lyle
 *
 */
public class P5_04 {

	public static void main(String[] args) {
		
		System.out.println(middle("stamina"));

	}

	public static String middle(String str) {
		int strLength = str.length();
		if(strLength % 2 == 0) {
			return str.substring(strLength / 2 - 1, strLength / 2 + 1 );
		} else {return str.substring(strLength / 2, strLength / 2 + 1);}
	}
}
