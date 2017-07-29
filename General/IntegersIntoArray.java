import java.util.Scanner;
import java.util.ArrayList;;
/**
 * This program reads in a series of integers and saves them into an array (with a min / max method for fun!)
 * @author Lyle
 *
 */
public class IntegersIntoArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Please enter numbers ('Q' to quit): ");
		while(in.hasNextInt()) {
			list.add(in.nextInt());
		}
		
		System.out.println(list);
		in.close();
		minMax(list);

	}

	public static void minMax(ArrayList<Integer> list) {
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < list.size(); i++) {
			int temp = list.get(i);
			if(temp < min) {
				min = temp;
			}

			if(temp > max) {
				max = temp;
			}
		}
		System.out.printf("Max = %d | Min = %d", max, min);
	}
}
