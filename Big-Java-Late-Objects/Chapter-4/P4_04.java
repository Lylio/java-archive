import java.util.ArrayList;
import java.util.Scanner;

/**
 * P4.4 Complete the program in How To 4.1 on page 169. Your program should read twelve
 * temperature values and print the month with the highest temperature.
 * @author Lyle
 *
 */
public class P4_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double highest = 0;
		int i;
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("Please enter temperatures (Q to quit): ");
		while(in.hasNextDouble()) {
			list.add(in.nextDouble());
		}
		
		
		for(i = 0; i < list.size(); i++) {
			if(list.get(i) > highest) {
				highest = list.get(i);
			}
			
			
		}
		System.out.printf("\nHighest temp = %.2f | month = %d", highest, i);
		in.close();
		
		

	}

}
