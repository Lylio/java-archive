import java.util.Scanner;
/**
 * P2.3 Write a program that reads a number and displays the square, cube, and fourth
 * power. Use the Math.pow method only for the fourth power.
 * @author Lyle
 *
 */
public class P2_03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int userNum = in.nextInt();
		
		square(userNum);
		cube(userNum);
		fourth(userNum);
		
		in.close();
	}
	
	
	//Square, cube and fourth methods
	public static int square(int i) {
		int total = i * i;
		System.out.println("Squared total is " + total);
		return total;
	}
	
	public static int cube(int i) {
		int total = i * i * i;
		System.out.println("Cubed total is " + total);
		return total;
	}
	
	public static int fourth(int i) {
		int total = (int)Math.pow(i, 4);
		System.out.println("Fourthed total is " + total);
		return total;
	}

}
