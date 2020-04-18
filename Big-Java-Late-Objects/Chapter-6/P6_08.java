

/**
 * P6.8 Write a method that implements the algorithm developed in Section 6.6.
 * @author Lyle
 *
 */
public class P6_08 {

	public static void main(String[] args) {
		
		int[] array = {5, 3, 8, 6, 7, 2};
		swap(array); // 6 7 2 5 3 8
		
	}
	
	public static int[] swap(int[] array) {
		int i = 0;
		int j = array.length / 2;
		while(i < array.length / 2) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j++;
		}
		for(int a : array) {
			System.out.print(a + " ");
		}
		return array;
		
	}

}
