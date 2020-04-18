
 /**
  * P5.15 Write a recursive method
  * public static String reverse(String str)
  * that computes the reverse of a string. For example, reverse("flow") should return
  * "wolf". Hint: Reverse the substring starting at the second character, then add the first
  * character at the end. For example, to reverse "flow", first reverse "low" to "wol", then
  * add the "f" at the end.
 * @author Lyle
 *
 */
public class P5_15 {

	public static void main(String[] args) {
		
		System.out.println(reverse("apples"));

	}
	
	public static String reverse(String str) {
		if (str.length() > 1) {
			
			return reverse(str.substring(1)) + str.charAt(0);
        }
        return str;
	}

}
