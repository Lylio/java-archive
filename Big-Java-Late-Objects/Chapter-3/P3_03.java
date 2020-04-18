import java.util.Scanner;

/**
 * P3.3 Write a program that reads an integer and prints how many digits the number has, by
 * checking whether the number is >= 10, >= 100, and so on. (Assume that all integers are
 * less than ten billion.) If the number is negative, first multiply it with –1.
 * @author Lyle
 *
 */
public class P3_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int num = in.nextInt();
		int digits = 0;
		
		if(num < 10) {digits = 1;}
		else if(num >= 10 && num < 100) {digits = 2;}
		else if(num >= 100 && num < 1000) {digits = 3;}
		else if(num >= 1000 && num < 10000) {digits = 4;}
		else if(num >= 10000 && num < 100000) {digits = 5;}
		else if(num >= 100000 && num < 1000000) {digits = 6;}
		else if(num >= 1000000 && num < 10000000) {digits = 7;}
		else if(num >= 10000000 && num < 100000000) {digits = 8;}
		else if(num >= 100000000 && num < 1000000000) {digits = 9;}
		
		System.out.println("Digits = " + digits);
		in.close();
	}
	
}
