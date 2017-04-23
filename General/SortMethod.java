import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Practice using sort methods on Arrays/ArrayLists
 * @author Lyle
 *
 */
public class SortMethod {

	public static void main(String[] args) {
		
		int[] myArray = {5, 1, 8, 5, 7, 3, 9, 8, 3};
		
		System.out.println(Arrays.toString(myArray));
		
		Arrays.sort(myArray);
		
		System.out.println(Arrays.toString(myArray));
		
		//similar exercise with ArrayList using Collections:
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Orange"); myList.add("Green"); myList.add("Purple"); myList.add("Brown"); myList.add("Blue");
		
		System.out.println(myList);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		

	}

}
