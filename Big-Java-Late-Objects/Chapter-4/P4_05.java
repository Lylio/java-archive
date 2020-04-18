import java.util.Scanner;
import java.util.ArrayList;

/**
 * P4.5 Write a program that reads a set of floating-point values. Ask the user to enter the
 * values, then print
 * the average of the values.
 * the smallest of the values.
 * the largest of the values.
 * the range, that is the difference between the smallest and largest.
 * Of course, you may only prompt for the values once.
 * @author Lyle
 *
 */
public class P4_05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		System.out.println("Please enter floating values (Q to quit): ");
		while(in.hasNextDouble()) {
			list.add(in.nextDouble());
		}
		
		difference(list);
		in.close();
	}
	
	public static double average(ArrayList<Double> list) {
		double total = 0;
		double average = 0;
		for(int i = 0; i < list.size(); i++) {
			total = total + list.get(i);
		}
		average = total / list.size();
		System.out.println("Average = " + average);
		return average;
	}
	
	public static double smallest(ArrayList<Double> list) {
		double smallest = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < smallest) {
				smallest = list.get(i);
			}
		}
		System.out.println("Smallest = " + smallest);
		return smallest;
	}
	
	public static double largest(ArrayList<Double> list) {
		double largest = list.get(0);
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > largest) {
				largest = list.get(i);
			}
		}
		System.out.println("Largest = " + largest);
		return largest;
	}
	
	public static double difference(ArrayList<Double> list) {
		double min = smallest(list);
		double max = largest(list);
		double difference = max - min;
		System.out.println("Difference = " + difference);
		return difference;
	}
	
}
