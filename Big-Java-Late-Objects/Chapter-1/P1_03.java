
/**
 * P1.3 Write a program that prints the product of the first ten positive 
 * integers, 1 × 2 × … × 10. (Use * to indicate multiplication in Java.)
 * @author Lyle
 *
 */
public class P1_03 {

	public static void main(String[] args) {
		
			int total = 1;
			for(int i = 1; i <= 10; i++) {
				total *= i;
			}
			
			System.out.println(total);

	}

}
