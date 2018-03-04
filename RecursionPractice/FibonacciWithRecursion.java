
/**Return the nth value in the Fibonacci sequence using recursion
 * (nth number in theFibonacci sequence adds the two previous
 * numbers before it i.e. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc)
 * @author Lyle
 *
 */
public class FibonacciWithRecursion {

	public static void main(String[] args) {
		
		System.out.println(fib(8)); // 21 expected

	}
	
	public static long fib(int index) {
		 if (index == 0) // Base case
		   return 0;
		 else if (index == 1) // Base case
		   return 1;
		 else // Reduction and recursive calls
		   return fib(index - 1) + fib(index - 2);
	   }
	 


}
