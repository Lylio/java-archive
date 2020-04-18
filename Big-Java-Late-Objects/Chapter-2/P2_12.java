import java.util.Scanner;
/**
 * P2.12 Write a program that prompts the user for the drive letter
 *(C), the path (\Windows\System), the file name (Readme), and the extension (txt). Then
 * print the complete file name C:\Windows\System\Readme.txt.
 * @author Lyle
 *
 */
public class P2_12 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter drive letter: ");
		String driveLetter = in.next();
		System.out.print("Please enter file path: ");
		String filePath = in.next();
		System.out.print("Please enter file name: ");
		String fileName = in.next();
		System.out.print("Please enter extension: ");
		String fileExtension = in.next();
		in.close();
		
		System.out.println(driveLetter + ":" + filePath + "\\" + fileName + "." + fileExtension);
		
		
		

	}

}
