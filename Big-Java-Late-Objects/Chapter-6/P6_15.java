

/**
 * P6.15 Write a program that produces ten random permutations of the numbers 1 to 10. To
generate a random permutation, you need to fill an array with the numbers 1 to 10
so that no two entries of the array have the same contents. You could do it by brute
force, by generating random values until you have a value that is not yet in the array.
But that is inefficient. Instead, follow this algorithm.
Make a second array and fill it with the numbers 1 to 10.
Repeat 10 times
Pick a random element from the second array.
Remove it and append it to the permutation array.
 * @author Lyle
 *
 */
public class P6_15 {

	public static void main(String[] args) {
		
	
		
		
	}
	
	public static int numGen() {
		int num = (int)(Math.random() * 10 + 1);
		return num;
	}

}
