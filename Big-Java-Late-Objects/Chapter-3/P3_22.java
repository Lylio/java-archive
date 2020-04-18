import java.util.Scanner;

/**
 * P3.22 Write a program that computes taxes for the following schedule.
 * @author Lyle
 *
 */
public class P3_22 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your status(Married/Single): ");
        String status = in.nextLine().toLowerCase();
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();
        in.close();

        double tax = 0;
        
        if (status.equals("single")) {
            if (income > 0 && income <= 8000) {
                tax = income * 0.1;
            }
            else if (income > 8000 && income <= 32000) {
                tax += 800 + income * 0.15;
            }
            else if (income > 32000) {
                tax += 4400 + income * 0.25;
            }
        }
        else if (status.equals("married")) {
            if (income > 0 && income <= 1600) {
                tax = income * 0.1;
            }
            else if (income > 16000 && income <= 64000) {
                tax += 1600 + income * 0.15;
            }
            else if (income > 32000) {
                tax += 8800 + income * 0.25;
            }
        }
        else if (!status.equals("single") && !status.equals("married")) {
            System.out.println("Invalid status!");
            return;
        }
        else if (income < 1) {
            System.out.println("Not valid income!");
            return;
        }

        System.out.printf("Your tax is: $%.2f", tax);
      

	}

}
