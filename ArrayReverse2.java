import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**Reversing an array with collections
 * @author Lyle
 *
 */
public class ArrayReverse2 {

	public static void main(String[] args) {
		
		//Convert the array to an ArrayList
		String[] citynames = {"Glasgow", "Edinburgh", "Dundee", "Aberdeen"};
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
		System.out.println(citylist);
		
		//Reverse the ArrayList with Collections
		Collections.reverse(citylist);
		
		System.out.println(citylist);
		
		//Convert back to an array
		citynames = citylist.toArray(new String[citylist.size()]);
		for(String i : citynames) {
			System.out.print(i + " ");
		}

	}

}
