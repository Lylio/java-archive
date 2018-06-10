
/**Practice using the ternary operator
 * @author Lyle
 *
 */
public class TernaryPractice {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 7;
		int c = (a < b) ? a : b; //assigns the smaller of the two values to c
		
		System.out.println("The smaller of the two values is " + c);
		
		boolean test = false;
		String s = test ? "Yes, it's true." : "Sorry, it's false";
		System.out.println(s);
	}

}
