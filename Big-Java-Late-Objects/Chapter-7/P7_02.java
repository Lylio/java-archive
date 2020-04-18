import java.io.File;
import java.util.Scanner;
/**
 * P7.2 Write a program that reads a file containing text. Read each line and send it to the
 * output file, preceded by line numbers. If the input file is
 * Mary had a little lamb
 * Whose fleece was white as snow.
 * And everywhere that Mary went,
 * The lamb was sure to go!
 * then the program produces the output file
 * SEE BOOK
 * @author Lyle
 *
 */
public class P7_02 {

	public static void main(String[] args) {
		
		File inputFile = new File("C:\\Users\\Lyle\\Desktop\\mary.txt");
		try {
		
			Scanner fileScanner = new Scanner(inputFile);
			int lineCounter = 1;
			while(fileScanner.hasNextLine()) {
				System.out.println("**" + lineCounter + "**: " +	 fileScanner.nextLine());
				lineCounter++;
			} fileScanner.close();
			
		} catch (Exception e) {
			System.out.println("File not found error");
		}
		
		

	}

}
