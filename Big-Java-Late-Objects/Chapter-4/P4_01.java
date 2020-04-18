
/** P4.1 Write programs with loops that compute
 * a. The sum of all even numbers between 2 and 100 (inclusive).
 * b. The sum of all squares between 1 and 100 (inclusive).
 * c. All powers of 2 from 20 up to 220.
 * d. The sum of all odd numbers between a and b (inclusive), where a and b are
 * inputs.
 * e. The sum of all odd digits of an input. (For example, if the input is 32677, the
 * sum would be 3 + 7 + 7 = 17.)
 * @author Lyle
 *
 */
public class P4_01 {

	public static void main(String[] args) {
		
		sumEven(2, 100);
		sumSquares(1, 100);
		sumPowers(20, 200);
		sumOdd(4, 19);
		sumOddDigits(32677);


	}

	public static int sumEven(int a, int b) {
		int total = 0;
		for(int i = a; i <= b; i += 2) {
			total = total + i;
		} System.out.println(total); return total;
	}
	
	public static int sumSquares(int a, int b) {
		int total = 0;
		for(int i = a; i <= b; i++) {
			total = total + (i * i);
		} System.out.println(total); return total;
	}
	
	public static void sumPowers(int a, int b) {
		for(int i = a; i <= b; i++) {
			System.out.println(Math.pow(i, 2));
		}
	}
	
	public static int sumOdd(int a, int b) {
		int total = 0;
		for(int i = a; i <= b; i++) {
			if(i % 2 != 0) {
				total += i;
			}
		} System.out.println(total); return total;
	}
	
	public static int sumOddDigits(int a) {
		int total = 0;
		while(a > 0) {
			int remainder = a % 10;
			if(remainder % 2 != 0) {
				total += remainder;
				}
			a = a / 10;
		}
		System.out.println(total); return total;
		} 
	

}

