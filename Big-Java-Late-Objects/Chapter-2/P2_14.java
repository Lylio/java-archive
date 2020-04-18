import java.util.Scanner;
/**
 * P2.14 Write a program that reads a number between 1,000 and 999,999 from the user and
 * prints it with a comma separating the thousands.
 * @author Lyle
 *
 */
public class P2_14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number between 1000 and 999999: ");
		String userNum = in.next();
		in.close();
		
		String prefix = userNum.substring(0, userNum.length() - 3);
		String postfix = userNum.substring(userNum.length() - 3);
        System.out.println(prefix + "," + postfix);
		

	}

}
