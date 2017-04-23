/**
 * @author Lyle
 *This program randomly swaps two characters using StringBuilder
 */

public class CharSwap {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Workers of the world, unite!");
		int sentenceLength = builder.length();
		int randomNum = (int) (Math.random() * sentenceLength - 1);
		int randomNum2 = (int) (Math.random() * sentenceLength - 1);
		
		//Select two random characters from the string
		char character = builder.charAt(randomNum);
		char character2 = builder.charAt(randomNum2);
		
		//Swap two characters over
		builder.setCharAt(randomNum, character2);
		builder.setCharAt(randomNum2, character);
		
		//Print reassembled string
		System.out.println(builder);
	}
}
