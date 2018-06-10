
/** This program reverses the contents of an array
 * @author Lyle
 *
 */
public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] array = {5, 3, 8, 7, 3, 2, 8, 7};
		reverse(array); // 7 8 2 3 7 8 3 5

	}

	public static int[] reverse(int[] array) {

		for(int i = 0; i < array.length / 2; i++)
		{
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}

		for(int j : array) {System.out.print(j + " ");};
		return array;

	}

}


