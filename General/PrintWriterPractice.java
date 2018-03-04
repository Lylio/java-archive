import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterPractice {

	public static void main(String[] args) {
		
		//Create PrintWriter object surrounded in try/catch block
		
		try {
			
			PrintWriter out = new PrintWriter("C:\\Users\\utt\\Desktop\\hello2.txt");
			out.println("This is the first line of text in the new file.");
			out.println("This is the second line of text in the new file.");
			out.close();
			System.out.println("File printed correctly");
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Error - file not printed (check location)");
			System.err.println(e.toString());
		
		}

	}

}
