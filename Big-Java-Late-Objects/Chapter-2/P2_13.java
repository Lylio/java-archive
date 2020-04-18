import java.util.Scanner;
/**
 * P2.13 Write a program that reads a number between 1,000 and 999,999 from the user,
 * where the user enters a comma in the input. Then print the number without a
 * comma.
 * @author Lyle
 *
 */
public class P2_13 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number between 1,000 and 999,999: ");
		String userNum = in.next();
		
		StringBuilder sb = new StringBuilder(userNum);
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == ',') {
				sb.deleteCharAt(i);
			}
		}
		
		System.out.println(sb.toString());
		in.close();
	}

}
