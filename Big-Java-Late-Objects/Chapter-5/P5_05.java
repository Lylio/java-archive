
 /**
  * P5.5 Write a method
  * public static String repeat(String str, int n)
  * that returns the string str repeated n times. For example, repeat("ho", 3) returns
  * "hohoho".
 * @author Lyle
 *
 */
public class P5_05 {

	public static void main(String[] args) {
		
		System.out.println(repeat("boat", 4));

}
	
	public static String repeat(String str, int n) {
		
		String newString = "";
		for(int i = 0; i < n; i++) {
			newString += str;
		} return newString;
	
	}
	
	
	
}