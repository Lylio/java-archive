
/**
 * P1.2 Write a program that prints the sum of the first 
 * ten positive integers, 1 + 2 + … + 10.
 * @author Lyle
 *
 */
public class P1_02 {

	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println(total);

	}

}
