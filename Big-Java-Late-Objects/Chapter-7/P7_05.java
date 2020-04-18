import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * P7.5 Write a program that asks the user for a file name and prints the number of characters,
 * words, and lines in that file.
 * @author Lyle
 *
 */
public class P7_05 {

	public static void main(String[] args) {
		
		//Ask for location of file
				Scanner locationScanner = new Scanner(System.in);
				System.out.println("Please enter location of file: ");
				String fileLocation = locationScanner.nextLine();
				locationScanner.close();
				
				
		//Create file object and scan file
				int charTotal = 0;
				int wordTotal = 0;
				int lineTotal = 0;
				Scanner fileScanner = null;
				
				File inputFile = new File(fileLocation);
				try {
					fileScanner = new Scanner(inputFile);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				while(fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					String[] words = line.split(" ");
					
					lineTotal++;
					wordTotal += words.length;
					charTotal += line.length();
				} 
				
				System.out.println("Number of characters: " + charTotal);
				System.out.println("Number of words: " + wordTotal);
				System.out.println("Number of lines: " + lineTotal);
		
	}

}
