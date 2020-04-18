
 /**
  * P5.3 Write the following methods.
  * a. int firstDigit(int n), returning the first digit of the argument
  * b. int lastDigit(int n), returning the last digit of the argument
  * c. int digits(int n), returning the number of digits of the argument
  * For example, firstDigit(1729) is 1, lastDigit(1729) is 9, and digits(1729) is 4. Provide a
  * program that tests your methods.
 * @author Lyle
 *
 */
public class P5_03 {

	public static void main(String[] args) {
		
		System.out.println(digits(434));

	}

	public static int firstDigit(int n) {
		while(n > 10) {
			n = n / 10;
		} return n;
	}
	
	public static int lastDigit(int n) {
		n = n % 10;
		return n;
	}
	
	public static int digits(int n) {
		int counter = 0;
		while(n > 0) {
			n = n / 10;
			counter++;
		} return counter;
	}
}
