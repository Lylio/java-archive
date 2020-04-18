import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * P7.9 Write a program that reads each line in a file, reverses its lines, and writes them to
 * another file. For example, if the file input.txt contains the lines
 * Mary had a little lamb
 * Its fleece was white as snow
 * And everywhere that Mary went
 * The lamb was sure to go.
 * and you run
 * reverse input.txt output.txt
 * then output.txt contains
 * The lamb was sure to go.
 * And everywhere that Mary went
 * Its fleece was white as snow
 * Mary had a little lamb
 * @author Lyle
 *
 */
public class P7_09 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Create file object, scan and save each line into an ArrayList
		File inputFile = new File("C:\\Users\\Lyle\\Desktop\\javadocs\\mary.txt");
		Scanner fileScanner = new Scanner(inputFile);
		ArrayList<String> list = new ArrayList<String>();
		while(fileScanner.hasNextLine()) {
			list.add(fileScanner.nextLine());
		}
		
		//Output in reverse with for loop
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		fileScanner.close();
	}

}
