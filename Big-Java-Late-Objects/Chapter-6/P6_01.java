import java.util.HashMap;

/**
 * P6.1 Write a program that initializes an array with ten random integers and then prints
 * four lines of output, containing
 * • Every element at an even index.
 * • Every even element.
 * • All elements in reverse order.
 * • Only the first and last element. 	
 * @author Lyle
 *
 */
public class P6_01 {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, (int)(Math.random() * (10 - 1) + 1)); map.put(2, (int)(Math.random() * (10 - 1) + 1)); map.put(3, (int)(Math.random() * (10 - 1) + 1));
		map.put(4, (int)(Math.random() * (10 - 1) + 1)); map.put(5, (int)(Math.random() * (10 - 1) + 1)); map.put(6, (int)(Math.random() * (10 - 1) + 1));
		map.put(7, (int)(Math.random() * (10 - 1) + 1)); map.put(8, (int)(Math.random() * (10 - 1) + 1)); map.put(9, (int)(Math.random() * (10 - 1) + 1));
		map.put(10, (int)(Math.random() * (10 - 1) + 1));
		
		int[] array = {map.get(1), map.get(2), map.get(3), map.get(4), map.get(5), map.get(6), map.get(7), map.get(8), map.get(9), map.get(10)};
		
		for(int i : array) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		evenIndex(array);
		System.out.println();
		evenElement(array);
		System.out.println();
		reverse(array);
		System.out.println();
		firstAndLast(array);
		
	}
	
	public static void evenIndex(int[] array) {
		System.out.print("Even index: ");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i + 1] + " ");
			}
		}
	}


	public static void evenElement(int[] array) {
		System.out.print("Even element: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}

		}

	}
	
	public static void reverse(int[] array) {
		System.out.print("Reversed: ");
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void firstAndLast(int[] array) {
		int first = array[0];
		int last = array[array.length - 1];
		System.out.println("First: " + first +  " " + "Last: " + last);
	}
	
}
