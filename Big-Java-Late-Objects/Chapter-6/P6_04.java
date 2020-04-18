

/**
 * P6.4 Write a method sumWithoutSmallest that computes the sum of an array of values,
except for the smallest one, in a single loop. In the loop, update the sum and the
smallest value. After the loop, return the difference.
 * @author Lyle
 *
 */
public class P6_04 {

	public static void main(String[] args) {
		
		int[] array = {4, 2, 8, 6, 4, 8, 7, 4};
		System.out.println(sumWithoutSmallest(array)); //41
		
	}

	public static int sumWithoutSmallest(int[] array) {
		int total = 0;
		int smallest = array[0];
		for(int i = 0; i < array.length; i ++) {
			total += array[i];
			if(array[i] < smallest) {
				smallest = array[i];
			}
		}
		
		return total - smallest;
	} 
}

