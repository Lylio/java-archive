import java.util.ArrayList;
import java.util.Arrays;

/** Practice converting an array to an ArrayList
 * @author Lyle
 *
 */
public class ArrayToArrayListConversion {

	public static void main(String[] args) {
		
		String[] citynames = {"Glasgow", "Edinburgh", "Dundee", "Aberdeen"};
		ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));
		
		System.out.println(citylist);

	}

}
