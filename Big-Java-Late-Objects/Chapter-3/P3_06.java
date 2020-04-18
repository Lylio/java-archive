import java.util.Scanner;

/** P3.6 Repeat Exercise P3.5, but before reading the numbers, ask the user whether increasing/
 * decreasing should be “strict” or “lenient”. In lenient mode, the sequence 3 4 4 is
 * increasing and the sequence 4 4 4 is both increasing and decreasing.
 * @author Lyle
 *
 */
public class P3_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Strict or lenient? (S / L): ");
		String type = in.next();
		type = type.toUpperCase();
		System.out.print("Please enter first number: ");
		int num1 = in.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Please enter third number: ");
		int num3 = in.nextInt();
		
		if(type.equals("S")) {
			if(num3 > num2 && num2 > num1) {
				System.out.println("Increasing.");
			} else if(num1 > num2 && num2 > num3) {
				System.out.println("Decreasing.");
			} else {
				System.out.println("Neither increasing nor decreasing.");
			}
		}
		
		if(type.equals("L")) {
			if(num3 > num2 && num2 > num1) {
				System.out.println("Increasing.");
		} else if(num3 == num2 && num2 > num1) {
			System.out.println("Increasing.");
		} else if(num3 > num2 && num2 == num1) {
			System.out.println("Increasing.");
		} else if(num1 > num2 && num2 > num3) {
			System.out.println("Decreasing.");
		} else if(num1 > num2 && num2 > num3) { 
			System.out.println("Decreasing."); 
	    } else if(num1 == num2 && num2 > num3)  {
			System.out.println("Decreasing."); 		
		} else if(num1 > num2 && num2 == num3) { 
			System.out.println("Decreasing."); 
		} else if(num1 == num2 && num2 == num3) {
			System.out.println("Both increasing and decreasing.");
		} else {
			System.out.println("Neither increasing nor decreasing.");
		}
			
	}
		in.close();
}
	
}
