

/**
 * P6.13 Write a program that generates a sequence of 20 random die tosses in an array and
that prints the die values, marking only the longest run, like this:
1 2 5 5 3 1 2 4 3 (2 2 2 2) 3 6 5 5 6 3 1
If there is more than one run of maximum length, mark the first one.
 * @author Lyle
 *
 */
public class P6_13 {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = dieToss();
		}
		
		printArray(array);
		
		
	}
		
	
	
	public static int dieToss() {
		return (int)(Math.random() * 6 + 1);
	}
	
	public static void printArray(int[] array) {
		for(int i : array) {
			System.out.print(array[i] + " ");
	}

}
	
}
