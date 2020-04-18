import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * P7.4 Write a program that reads a file containing two columns of floating-point numbers.
 * Prompt the user for the file name. Print the average of each column.
 * @author Lyle
 *
 */
public class P7_04 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Ask for location of file
		Scanner locationScanner = new Scanner(System.in);
		System.out.println("Please enter location of file: ");
		String fileLocation = locationScanner.nextLine();
		locationScanner.close();
		
		//Create file object and scan
		File inputFile = new File(fileLocation);
		Scanner fileScanner = new Scanner(inputFile);
		double col1Total = 0;
		double col2Total = 0;
		int lineCount = 0;
		while(fileScanner.hasNextDouble()) {
			col1Total += fileScanner.nextDouble();
			col2Total += fileScanner.nextDouble();
			lineCount++;
		}
		fileScanner.close();
		System.out.printf("Column 1 average: %.2f\n", (col1Total / lineCount));
		System.out.printf("Column 2 average: %.2f", (col2Total / lineCount));

	}

}
