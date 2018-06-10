

/**Using recursion, insert a dollar sign after each character in a string
 * @author Lyle
 *
 */
public class DollarSignsIntoString {

	public static void main(String[] args) {
		
		System.out.println(allDollars("zebra")); //z$e$b$r$a
		System.out.println(allDollars("alphabet")); //a$l$p$h$a$b$e$t
		
	}
	
	public static String allDollars(String str) {
		
		if(str.length() <= 1) {
			return str;
		}
		
		return str.charAt(0) + "$" + allDollars(str.substring(1));
			
	}

}
