

/**
 * P6.6 Compute the alternating sum of all elements in an array. For example, if your program
reads the input
1 4 9 16 9 7 4 9 11
then it computes
1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2
 * @author Lyle
 *
 */
public class P6_06 {

	public static void main(String[] args) {
		
		int[] array = {3, 8, 5, 9, 3, 7, 6, 1, 2};
		System.out.print(altSum(array)); // -6
		
	}

	public static int altSum(int[] array) {
		int total = array[0];
		for(int i = 1; i < array.length - 1; i += 2) {
			total -= array[i];
			total += array[i + 1];
		}
		
		return total;
	}
}
