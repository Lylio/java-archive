

/**
 * P6.2 Write array methods that carry out the following tasks for an array of integers. For
 * each method, provide a test program.
 * a. Swap the first and last elements in the array.
 * b. Shift all elements by one to the right and move the last element into the first
 * position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
 * c. Replace all even elements with 0.
 * d. Replace each element except the first and last by the larger of its two neighbors.
 * e. Remove the middle element if the array length is odd, or the middle two
 * elements if the length is even.
 * f. Move all even elements to the front, otherwise preserving the order of the
 * elements.
 * g. Return the second-largest element in the array.
 * h. Return true if the array is currently sorted in increasing order.
 * i. Return true if the array contains two adjacent duplicate elements.
 * j. Return true if the array contains duplicate elements (which need not be
 * adjacent).
 * @author Lyle
 *
 */
public class P6_02 {

	public static void main(String[] args) {
		
		int[] array = {6, 42, 18, 19, 24, 31, 33, 42, 56};
		System.out.println(duplicate2(array));
		
		
	}
	
	//a. Swap the first and last elements in the array.
	public static int[] swapFirstLast(int[] array) {
		
		int first = array[0];
		int last = array[array.length - 1];
		array[0] = last;
		array[array.length - 1] = first;
		for(int i : array) {System.out.print(i + " ");}
		return array;
	}
	
	//b. Shift all elements by one to the right and move the last element into the first
	public static int[] shiftRight(int[] array) {
		
		int last = array[array.length - 1];
		for(int i = array.length - 2; i > 0 ; i--) {
			array[array.length - 1] = array[i]; 
		} array[0] = last;
		for(int i : array) {System.out.print(i + " ");}
		return array;
	}
	
	//c. Replace all even elements with 0.
	public static int[] replaceWithZero(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			if(i % 2 != 0) {
				array[i] = 0;
			}
		}
		for(int i : array) {System.out.print(i + " ");}
		return array;
	}
	
	//d. Replace each element except the first and last by the larger of its two neighbors.
	public static int[] largerNeighbours(int[] array) {
		for(int i = 1; i < array.length - 1; i++) {
			if(array[i - 1] > array[i + 1]) {
				array[i] = array[i - 1];
			} else {
				array[i] = array[i + 1];
			}
		} for(int i : array) {System.out.print(i + " ");}
		return array;
	}
	
	//e. Remove the middle element if the array length is odd, or the middle two elements if the length is even.
	public static int[] removeElement(int[] array) {
	
		return array;
		
	}
	
	//f. Move all even elements to the front, otherwise preserving the order of the elements.
	public static int[] evenElements(int[] array) {
		int swapPos = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				int temp = array[swapPos];
				array[swapPos] = array[i]; 
				array[i] = temp;
				swapPos += 1;
			}
		}
		for(int i : array) {System.out.print(i + " ");}
		return array;
	}
	
	//g. Return the second-largest element in the array.
	public static int secondLargest(int[] array) {
		int largest = 0;
		int secondLargest = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			}
		}
		System.out.print(secondLargest);
		return secondLargest;
	}
	
	// h. Return true if the array is currently sorted in increasing order.
	public static boolean sorted(int[] array) {
		int currentDigit = array[0];
		for(int i = 0; i < array.length; i++) {
			if(currentDigit > array[i]) {
				return false;
			} else {
				currentDigit = array[i];
			}
		}
		return true;
	} 

	// i. Return true if the array contains two adjacent duplicate elements.
	public static boolean duplicate(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] == array[i + 1]) {
				return true;
			}
		}
		return false;
	}
	
	//j. Return true if the array contains duplicate elements (which need not be adjacent).
	public static boolean duplicate2(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(i != j && array[i] == array[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
