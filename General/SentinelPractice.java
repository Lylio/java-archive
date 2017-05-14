import java.util.Scanner;
import java.util.ArrayList;

public class SentinelPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a list of numbers ('Q' to quit): ");
		while(in.hasNextInt()) {
			list.add(in.nextInt());
		}
		
		in.close();
		
		for(int i : list) {
			
		System.out.print(i + ", ");
		
		}
		
		
	}

}
