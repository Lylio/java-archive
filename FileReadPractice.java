import java.util.Scanner;
import java.io.*;

/** Practice reading an external text file
 * @author Lyle
 *
 */
public class FileReadPractice {

	public static void main(String[] args) throws FileNotFoundException {
		
		fileReader();
		

	}
	
	public static void fileReader() throws FileNotFoundException {
		//Ask for location of file
		Scanner locationScanner = new Scanner(System.in);
		System.out.println("Please enter location of file: ");
		String fileLocation = locationScanner.nextLine();
		locationScanner.close();
		
		//Create file object with location of file and scan contents of file
		File inputFile = new File(fileLocation);
		Scanner fileScanner = new Scanner(inputFile);
		while(fileScanner.hasNextLine()) {
			System.out.println(fileScanner.nextLine());
		}
		
		fileScanner.close();
		
		
	}

}
