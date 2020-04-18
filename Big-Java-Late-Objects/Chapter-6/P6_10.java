

/**
 * P6.10 Write a method
 * public static boolean sameSet(int[] a, int[] b)
 * that checks whether two arrays have the same elements in some order, ignoring
 * duplicates. For example, the two arrays
 * 1 4 9 16 9 7 4 9 11
 * and
 * 11 11 7 9 16 4 1
 * would be considered identical. You will probably need one or more helper methods.
 * @author Lyle
 *
 */
public class P6_10 {

	public static void main(String[] args) {
		
		int[] a = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		int[] b = {11, 11, 7, 9, 16, 4, 1};
		
		System.out.println(sameSet(a, b));
		
	}

	public static boolean sameSet(int[] a, int[] b) {
		boolean isSameNumber = false;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					isSameNumber = true;
				}
			}
		} if(!isSameNumber) {
			return false;
		}
		
		return true;
	}
	
}
