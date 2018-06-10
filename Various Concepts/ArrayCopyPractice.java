

/**Practice with ArrayCopy method
 * @author Lyle
 *
 */
public class ArrayCopyPractice {

	public static void main(String[] args) {
		
		int[] array = {5, 8, 2, 5, 9, 1};
		int[] newArray = new int[array.length - 2];
		
		System.arraycopy(array, 0, newArray, 0, 2);
		System.arraycopy(array, 4, newArray, 2, 2);
		
		for(int i : newArray) {
			System.out.print(i + " ");
		}

		
	}

}
