import java.util.Scanner;

/**
 * P3.12 Write a program that translates a letter grade into a number grade. Letter grades are
 * A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and
 * 0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3.
 * However, an A+ has value 4.0.
 * Enter a letter grade: B The
 * numeric value is 2.7.
 * @author Lyle
 *
 */
public class P3_12 {
	 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String userInput = "";
		double numGrade = 0;
		double[] arrayGrades = {4.0, 3.0, 2.0, 1.0, 0.0};
		double tolerance = 0.3;


		
		System.out.print("Please enter grade: ");
		userInput = in.next();
		in.close();
		
		if(userInput.length() == 1) {
			
			if(userInput.equals("A")) {
				numGrade = arrayGrades[0];
			} else if (userInput.equals("B")) {
				numGrade = arrayGrades[1]; 
			} else if (userInput.equals("C")) {
				numGrade = arrayGrades[2]; 
			} else if (userInput.equals("D")) {
				numGrade = arrayGrades[3];
			} else if (userInput.equals("F")) {
				numGrade = arrayGrades[4];
			}
		
		}
		
		if(userInput.length() == 2) {
			
			if(userInput.equals("A+")) {
				numGrade = arrayGrades[0];
			} else if(userInput.equals("A-")) {
				numGrade = arrayGrades[0] - tolerance;
			} else if(userInput.equals("B+")) {
				numGrade = arrayGrades[1] + tolerance;
			} else if(userInput.equals("B-")) {
				numGrade = arrayGrades[1] - tolerance;
			} else if(userInput.equals("C+")) {
				numGrade = arrayGrades[2] + tolerance;
			} else if(userInput.equals("C-")) {
				numGrade = arrayGrades[2] - tolerance;
			} else if(userInput.equals("D+")) {
				numGrade = arrayGrades[3] + tolerance;
			} else if(userInput.equals("D-")) {
				numGrade = arrayGrades[3] - tolerance;
			}
		}
		System.out.println("Numeric vale is " + numGrade);
 }
	
}
