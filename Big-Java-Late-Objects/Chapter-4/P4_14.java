
/**
 * P4.14 Write a program that reads a number and prints all of its binary digits: Print the
 * remainder number % 2, then replace the number with number / 2. Keep going until the
 * number is 0. For example, if the user provides the input 13, the output should be
 * 1
 * 0
 * 1
 * 1
 * @author Lyle
 *
 */
public class P4_14 {

	public static void main(String[] args) {
		
		int num = 8;
		while(num > 0) {
			System.out.println(num % 2);
			num = num / 2;
		}

	}

}
