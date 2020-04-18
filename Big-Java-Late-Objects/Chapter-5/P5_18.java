
 /**
  * P5.18 Use recursion to determine the number of digits in an integer n. Hint: If n is < 10, it
  * has one digit. Otherwise, it has one more digit than n / 10.
 * @author Lyle
 *
 */
public class P5_18 {

	public static void main(String[] args) {
		
		System.out.println(numOfDigits(4535));
	}
	
	public static int numOfDigits(int num) {

		if(num < 10) {
			return 1;
		} else {
			return numOfDigits(num / 10) + 1;
		}

	}

}
