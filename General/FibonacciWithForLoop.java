
/** 
* Java program to find Fibonacci series of a given number 
* and print them in console.
* (nth number in theFibonacci sequence adds the two previous
* numbers before it i.e. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, etc)
* @author Lyle
*/

public class FibonacciWithForLoop {

	public static void main(String[] args) {
		
		fibonacci(8);

	}
	
	public static void fibonacci(int length) {
		int a = -1;
		int b = 1;
		int c = 0;

		for (int i = 0; i <= length; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
