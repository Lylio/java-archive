import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * P7.3 Repeat Exercise P7.2, but allow the user to specify the file name on the commandline.
 * If the user doesn’t specify any file name, then prompt the user for the name.
 * @author Lyle
 *
 */
public class P7_03 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Ask for location of file
				Scanner locationScanner = new Scanner(System.in);
				System.out.println("Please enter location of file: ");
				String fileLocation = locationScanner.nextLine();
				locationScanner.close();
				
		//Create file object and scan each line of file
				File inputFile = new File(fileLocation);
				Scanner fileScanner = new Scanner(inputFile);
				int lineCounter = 1;
				while(fileScanner.hasNextLine()) {
					System.out.println("**" + lineCounter + "**: " + fileScanner.nextLine());
					lineCounter++;
				} fileScanner.close();
		

	}

}
