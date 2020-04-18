import java.util.Scanner;

/**
 * P3.21 The original U.S. income tax of 1913 was quite simple. The tax was
 * • 1 percent on the first $50,000.
 * • 2 percent on the amount over $50,000 up to $75,000.
 * • 3 percent on the amount over $75,000 up to $100,000.
 * • 4 percent on the amount over $100,000 up to $250,000.
 * • 5 percent on the amount over $250,000 up to $500,000.
 * • 6 percent on the amount over $500,000.
 * There was no separate schedule for single or married taxpayers. Write a program that
 * computes the income tax according to this schedule.
 * @author Lyle
 *
 */
public class P3_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Please enter your annual income: ");
        double income = in.nextDouble();
        double taxRate = 0;
        double taxTotal = 0;
        in.close();
        
        if(income <= 50000) {
        	taxRate = 0.01;
        	taxTotal = income * taxRate;
        	System.out.printf("Total tax = $%.2f", taxTotal);
        } else  if(income > 50000 && income <= 75000) {
        	taxRate = 0.02;
        	taxTotal = income * taxRate;
        	System.out.printf("Total tax = $%.2f", taxTotal);
        } else  if(income > 75000 && income <= 100000) {
        	taxRate = 0.03;
        	taxTotal = income * taxRate;
        	System.out.printf("Total tax = $%.2f", taxTotal);
        } else  if(income > 100000 && income <= 250000) {
        	taxRate = 0.04;
        	taxTotal = income * taxRate;
        	System.out.printf("Total tax = " + taxTotal);
        } else  if(income > 250000 && income <= 500000) {
        	taxRate = 0.05;
        	taxTotal = income * taxRate;
        	System.out.printf("Total tax = $%.2f", taxTotal);
        } else  if(income > 500000) {
        	taxRate = 0.06;
        	taxTotal = income * taxRate;
        	System.out.printf("Total tax = $%.2f", taxTotal);
        }
        
        
        

	}

}
