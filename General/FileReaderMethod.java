import java.io.*;

public class FileReaderMethod {

	public static void main(String[] args) throws IOException {
		
		File textFile = new File("C:\\Users\\Lyle\\Desktop\\testdata.txt");
		
		FileReader reader = new FileReader(textFile);
		int charLength = reader.read();
		char[] myArray = new char[charLength];
		reader.read(myArray);
		
		for(char i : myArray) {
			System.out.println(i);
		}
		
		System.out.println(charLength);
		
	}

}
