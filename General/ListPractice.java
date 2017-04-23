import java.util.ArrayList;
import java.util.List;

/**Practice with List
 * @author Lyle
 *
 */
public class ListPractice {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String>();
		myList.add("Blue"); myList.add("Green"); myList.add("Purple"); myList.add("Orange");
		
		System.out.println("Third list element: ");
		System.out.println("\t" + myList.get(2));
		System.out.println("Full list: ");
		System.out.println("\t" + myList);

	}

}
