
/**
 * P2.3 Write a program that computes and displays the perimeter of a letter-size (8.5 × 11
 * inches) sheet of paper and the length of its diagonal.
 * @author Lyle
 *
 */
public class P2_02 {

	public static void main(String[] args) {
		double length = 11;
		double width = 8.5;
		double diagonal = Math.sqrt(width * width + length * length);
		double perimeter = (length * 2) + (width * 2);
		
		System.out.println("The perimeter is: " + perimeter + " inches.");
		System.out.printf("The diagonal is: %.2f %s", diagonal, "inches.");
		
		

	}

}
