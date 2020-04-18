import java.util.Scanner;
/**
 * P2.7 Write a program that prompts the user for a radius and then prints
 * - The area and circumference of a circle with that radius
 * - The volume and surface area of a sphere with that radius
 * @author Lyle
 *
 */
public class P2_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter radius: ");
		double radius = in.nextDouble();
		in.close();
		
		circle(radius);
		sphere(radius);

	}
	
	public static void circle(double radius) {
		double area = Math.PI * (radius * radius);
		double circumference = 2 * Math.PI * radius;
		System.out.printf("Area of circle is: %.2f\n", area);
		System.out.printf("Circumference of circle is: %.2f\n", circumference);
	}
	
	public static void sphere(double radius) {
		double volume = ((double)4 / 3) * Math.PI * (radius * radius * radius);
		double surfaceArea = 4 * Math.PI * (radius * radius);
		System.out.printf("Volume of sphere is: %.2f\n", volume);
		System.out.printf("Surface area of sphere is: %.2f\n", surfaceArea);
	}

}
