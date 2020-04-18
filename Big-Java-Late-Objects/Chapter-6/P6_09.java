

/**
 * P6.9 Write a method
 * public static boolean equals(int[] a, int[] b)
 * that checks whether two arrays have the same elements in the same order.
 * @author Lyle
 *
 */
public class P6_09 {

	public static void main(String[] args) {
		
		int[] array1 = {4, 7, 4, 2, 1};
		int[] array2 = {4, 7, 4, 2, 1};
		System.out.println(equals(array1, array2));
		
	}

	public static boolean equals(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
		
	}
}
