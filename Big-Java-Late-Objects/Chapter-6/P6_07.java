
/**
 * P6.7 Write a method that reverses the sequence of elements in an array. For example, if
you call the method with the array
1 4 9 16 9 7 4 9 11
then the array is changed to
11 9 4 7 9 16 9 4 1
 * @author Lyle
 *
 */
public class P6_07 {

	public static void main(String[] args) {

		int[] array = {5, 3, 8, 7, 3, 2, 8, 7};
		reverse(array); // 78237835
		


	}
	
 public static int[] reverse(int[] array) {
	 
	 for(int i = 0; i < array.length / 2; i++)
	 {
	     int temp = array[i];
	     array[i] = array[array.length - i - 1];
	     array[array.length - i - 1] = temp;
	 }
	 
	 for(int j : array) {System.out.print(j);};
	 return array;
	 
 	}

}
