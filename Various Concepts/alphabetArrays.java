
public class alphabetArrays {

	public static void main(String[] args) {

		int SIZE = 26;
		char[] alphabet;
		char[] reverseAlphabet;
		
		//creates an an array of the alphabet
		alphabet = new char [SIZE];
		for (int i = 0; i < SIZE; i++) {
			alphabet[i] = (char)('A' + i);
		}
		
		for(char c : alphabet) {
			System.out.print(c + " ");
		}
		
		System.out.println(); //new line
		
		//creates a reverse array of the alphabet
		reverseAlphabet = new char [SIZE];
		for (int i = 0; i < SIZE; i++) {
			reverseAlphabet[i] = (char)('Z' - i);
		}
		
		for(char c : reverseAlphabet) {
			System.out.print(c + " ");
		}
		
		
	}

}
