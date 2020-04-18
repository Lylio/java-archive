
 /**
  * P5.19 Use recursion to compute an, where n is a positive integer. Hint: If n is 1, then
  * an = a. If n is even, then an = (an/2)2. Otherwise, an = a × an–1.
 * @author Lyle
 *
 */
public class P5_19 {

	public static void main(String[] args) {
		
		System.out.println(method(3, 4));
		
	}
	
	public static int method(int a, int n) {
		
		if(n == 1) {
			return a;
		} else if (n % 2 == 0) {
			return method(a, n / 2) * method(a, n / 2);
		} else {
			return a * method(a, n - 1);
		}
	}

}
