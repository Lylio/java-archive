import java.util.Scanner;

/** 
 * P3.13Write a program that translates a number between 0 and 4 into the closest letter
 * grade. For example, the number 2.8 (which might have been the average of several
 * grades) would be converted to B–. Break ties in favor of the better grade; for example
 * 2.85 should be a B.
 * @author Lyle
 *
 */
public class P3_13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade = "";
		System.out.println("Please enter number grade: ");
		double numGrade = in.nextDouble();
		in.close();
		
		if(numGrade >= 4.0) {
			grade = "A";
		} else if (numGrade >= 3.7) {
            grade = "A-";
        }
        else if (numGrade >= 3.0) {
            grade = "B+";
        }
        else if (numGrade >= 2.85) {
            grade = "B";
        }
        else if (numGrade >= 2.7) {
            grade = "B-";
        }
        else if (numGrade >= 2.0) {
            grade = "C+";
        }
        else if (numGrade >= 1.85) {
            grade = "C";
        }
        else if (numGrade >= 1.7) {
            grade = "C-";
        }
        else if (numGrade >= 1.0) {
            grade = "D+";
        }
        else if (numGrade > 0.85) {
            grade = "D";
        }
        else if (numGrade > 0.7) {
            grade = "D-";
        }
        else {
            grade = "F";
        }
		
		System.out.println("Grade is: " + grade);
	}

}
