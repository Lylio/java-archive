import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * P7.1 Write a program that carries out the following tasks:
 * Open a file with the name hello.txt.
 * Store the message “Hello, World!” in the file.
 * Close the file.
 * Open the same file again.
 * Read the message into a string variable and print it.
 * @author Lyle
 *
 */
public class P7_01 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File("C:\\Users\\Lyle\\Desktop\\hello.txt");
	
			PrintWriter out = new PrintWriter("C:\\Users\\Lyle\\Desktop\\hello.txt");
			out.println("Hello, world!");
			out.close();
		
		Scanner in = new Scanner(inputFile);
		String fileMessage = in.nextLine();
		System.out.println(fileMessage);
		in.close();
		

	}

}
