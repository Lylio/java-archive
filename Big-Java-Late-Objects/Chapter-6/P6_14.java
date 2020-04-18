import java.util.Arrays;

/**
 * P6.14 Write a program that generates a sequence of 20 random values between 0 and 99 in
 * an array, prints the sequence, sorts it, and prints the sorted sequence. Use the sort
 * method from the standard Java library.
 * @author Lyle
 *
 */
public class P6_14 {

	public static void main(String[] args) {
		
		int[] array = new int[20];
		for(int i = 0; i < array.length; i++) {
			array[i] = numGen();
		}
		
		System.out.print("Random: " + " ");
		for(int j : array) {System.out.print(j + " ");}
		Arrays.sort(array);
		System.out.print("\nSorted: " + " ");
		for(int j : array) {System.out.print(j + " ");}
		
	}
	
	public static int numGen() {
		int num = (int)(Math.random() * 100);
		return num;
	}

}
