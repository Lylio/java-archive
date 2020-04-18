import java.util.Arrays;

/**
 * P6.5 Write a method public static void removeMin that removes the minimum value from a
partially filled array without calling other methods.
 * @author Lyle
 *
 */
public class P6_05 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		array[3] = 2;
		array[4] = 13;
		array[5] = 32;
		
		int[] arrayTest = removeMin(array);
		for(int i : arrayTest) {
			System.out.print(i + " ");
		}
		
		
	}
	
	public static int[] removeMin(int[] array) {
		  
	        int minIndex = 0; 
	        for (int i = 1; i < array.length; i++) { 
	            if (array[i] != 0 && array[i] < array[minIndex]) { 
	                minIndex = i; 
	            } 
	        } 
	       
	        return Arrays.copyOfRange(array, minIndex + 1, array.length); 
	}

}
