import java.util.Scanner;
import java.util.ArrayList;

/**
 * P4.2 Write programs that read a sequence of integer inputs and print
 * a. The smallest and largest of the inputs.
 * b. The number of even and odd inputs.
 * c. Cumulative totals. For example, if the input is 1 7 2 9, the program should print
 * 1 8 10 19.
 * d. All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
 * program should print 3 5 6.
 * @author Lyle
 *
 */
public class P4_02 {

	public static void main(String[] args) {

		duplicates();


	}

	public static void minMax() {

		Scanner in = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.println("Please enter integers ('Q' to quit): ");
		while (in.hasNextInt()) {
			int newNumber = in.nextInt();

			if (newNumber < min) {
				min = newNumber;
			}

			if (newNumber > max) {
				max = newNumber;
			}
		}

		System.out.printf("Largest number is: %d\n", max);
		System.out.printf("Smallest number is: %d\n", min);

		in.close();
	}

	public static void oddEvenTotal() {
		Scanner in = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		System.out.println("Please enter integers ('Q' to quit): ");
		while (in.hasNextInt()) {
			int newNumber = in.nextInt();
			if(newNumber % 2 == 0) {
				even++;
			} else{odd++;}
		}	
		System.out.println("Even total: " + even);
		System.out.println("Odd total: " + odd);
		in.close();
	}

	public static void cumulative() {
		Scanner in = new Scanner(System.in); 
		int total = 0;
		System.out.println("Please enter integers ('Q' to quit): ");
		while(in.hasNextInt()) {
			total = total + in.nextInt();
			System.out.print(total + " ");
		}
		in.close();
	}

	public static void duplicates() {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Please enter integers ('Q' to quit): ");
		while(in.hasNextInt()) {
			int temp = in.nextInt();
			list.add(temp);
		}

		for(int i = 0; i < list.size() - 1; i++) {
			if(list.get(i) == list.get(i + 1)) {
				System.out.print(list.get(i) + " ");
			}
			in.close();
		}

	}
}


