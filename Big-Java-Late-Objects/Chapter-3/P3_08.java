import java.util.Scanner;

/**Write a program that reads four integers and prints “two pairs” if the input consists
of two matching pairs (in some order) and “not two pairs” otherwise. For example,
1 2 2 1 two pairs
1 2 2 3 not two pairs
2 2 2 2 two pairs
 * @author Lyle
 *
 */
public class P3_08 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Please enter third number: ");
		int num3 = in.nextInt();
		System.out.print("Please enter fourth number: ");
		int num4 = in.nextInt();
		
	       if ((num1 == num2 && num3 == num4) ||
	           (num1 == num3 && num2 == num4) ||
	           (num1 == num4 && num2 == num3)) {

	               System.out.println("Two pairs");
	           }
	           else {
	               System.out.println("Not two pairs");
	           }
	       in.close();
	}

}
