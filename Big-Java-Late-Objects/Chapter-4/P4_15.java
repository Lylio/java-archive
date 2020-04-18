import java.util.Scanner;
import java.util.ArrayList;

/**
 * 4.15 Mean and standard deviation. Write a program that reads a set of floating-point data
 * values. Choose an appropriate mechanism for prompting for the end of the data set.
 * When all values have been read, print out the count of the values, the average,
 * and the standard deviation. The average of a data set {x1, . . ., xn} is x = xi n, where
 * xi = x1 +…+ xn is the sum of the input values. The standard deviation is
 * (SD formula - see book)
 * However, this formula is not suitable for the task. By the time the program has
 * computed x , the individual
 * xi are long gone. Until you know how to save these
 * values, use the numerically less stable formula
 * (other formula - see book)
 * You can compute this quantity by keeping track of the count, the sum, and the sum
 * of squares as you process the input values.
 * @author Lyle
 *
 */
public class P4_15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter values ('q' to quit): ");

		
		ArrayList<Double> list = new ArrayList<>();
		while(in.hasNextDouble()) {
			list.add(in.nextDouble());
		}
		
		standardDev(list);
		in.close();
	}
	
	public static int count(ArrayList<Double> list) {
		System.out.println("Count = " + list.size());
		return list.size();
		}
	

	public static double average(ArrayList<Double> list) {
		double total = 0;
		for(int i = 0; i < list.size(); i++) {
			total = total + list.get(i);
		}
		int tempCount = count(list);
		double average = total / tempCount;
		System.out.printf("Average = %.2f", average);
		return average;
	}
	
	public static double standardDev(ArrayList<Double> list) {
		double sd = 0;
		int tempCount = count(list);
		double tempAverage = average(list);
		double tempTotal = 0;
		for(int i = 0; i < list.size(); i++) {
			tempTotal += Math.pow(((list.get(i) - tempAverage)), 2);
		}
		sd = Math.sqrt((tempTotal / (tempCount - 1)));
		System.out.printf("\n\nStandard Deviation = %.2f", sd);
		return sd;
		
		
	}
	
}


