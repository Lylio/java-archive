import java.util.Scanner;
/**
 * P2.8 Write a program that asks the user for the lengths of the sides of a rectangle. Then
 * print
 * - The area and perimeter of the rectangle
 * - The length of the diagonal (use the Pythagorean theorem)
 * @author Lyle
 *
 */
public class P2_08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter length of rectangle: ");
		double length = in.nextDouble();
		System.out.print("Please enter width of rectangle: ");
		double width = in.nextDouble();
		in.close();
		
		rectangle(length, width);
	
	}
	
	public static void rectangle(double length, double width) {
		double area = length * width;
		double perimeter = (length * 2) + (width * 2);
		double diagonal = Math.sqrt((length * length) + (width * width));
		System.out.printf("Area = %.2f\n", area);
		System.out.printf("Perimeter = %.2f\n", perimeter);
		System.out.printf("Diagonal = %.2f\n", diagonal);
	}

}
