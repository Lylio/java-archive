import java.util.ArrayList;

/**Converts an ArrayList to an array
 * @author Lyle
 *
 */
public class ArrayListToArrayConversion {

	public static void main(String[] args) {
		
		ArrayList<String> colours = new ArrayList<String>();
		colours.add("blue");		
		colours.add("red");		
		colours.add("yellow");		
		colours.add("green");
		
		String[] coloursArray = colours.toArray(new String[colours.size()]);
		for(String i : coloursArray) {
			System.out.print(i + " ");
		}
		
	}
	
}