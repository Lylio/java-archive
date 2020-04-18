import java.util.Scanner;
/**
 * Prime numbers. Write a program that prompts the user for an integer and then prints
out all prime numbers up to that integer. For example, when the user enters 20, the
program should print
2
3
5
7
11
13
17
19
Recall that a number is a prime number if it is not divisible by any number except 1
and itself.
 * @author Lyle
 *
 */
public class P4_18 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int num = in.nextInt();
		in.close();
		
		boolean isPrime = true;
		for(int i = 2; i < num; i++) {
			int currentNum = i;
			for (int j = 2; j < currentNum; j++) {
				if (currentNum % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(currentNum);
			}

			isPrime = true;
		}
		

	}

}
