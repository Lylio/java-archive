import java.util.Scanner;
/** Generate a random number between two values
 * @author Lyle
 *
 */
public class randomNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter low value: ");
		int low = in.nextInt();
		System.out.println("Please enter high value: ");
		int high = in.nextInt();
		in.close();
		
		System.out.print("Random number: ");
		System.out.println(numGen(low, high));

	}
	
	public static int numGen(int low, int high) {
		int num = (int)(Math.random() * (high - low + 1) + low);
		return num;
	}

}
