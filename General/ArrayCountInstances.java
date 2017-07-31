
/**Count the number of instances of an array element
 * @author Lyle
 *
 */
public class ArrayCountInstances {

	public static void main(String[] args) {
		
		int count = 0;
		String toFind = "Apple";
		String[] words = {"Apple", "Orange", "Grapes", "Apple", "Grapes", "Apple"};
		
		for(String i : words) {
			if(i.equals(toFind)) {
			count++;
			}
		}
		
		System.out.println("Occurences of \"" + toFind + "\": " + count);

	}

}
