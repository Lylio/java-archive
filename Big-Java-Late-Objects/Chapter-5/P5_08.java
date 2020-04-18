
 /**
  * P5.8 It is a well-known phenomenon that most people are easily able to read a text whose
  * words have two characters flipped, provided the first and last letter of each word are
  * not changed. For example,
  * I dn’ot gvie a dman for a man taht can olny sepll a wrod one way. (Mrak Taiwn)
  * Write a method String scramble(String word) that constructs a scrambled version of a
  * given word, randomly
  * flipping two characters other than the first and last one. Then
  * write a program that reads words and prints the scrambled words.
 * @author Lyle
 *
 */
public class P5_08 {

	public static void main(String[] args) {
		
		System.out.println(scramble("Kaleidescope"));

	}
	
	public static String scramble(String word) {
		
		int upper = word.length() - 1;
		
		int randomNum1 = (int)(Math.random() * (upper - 1)) + 1;;
		int randomNum2 = (int)(Math.random() * (upper - 1)) + 1;;

		char[] letters = word.toCharArray();
		char char1 = letters[randomNum1];
		char char2 = letters[randomNum2];
		letters[randomNum1] = char2;
		letters[randomNum2] = char1;
		
		String output = new String(letters);
		return output;
		
		
	}

}
