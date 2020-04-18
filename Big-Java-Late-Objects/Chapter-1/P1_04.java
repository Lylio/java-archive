
/**
 * P1.4 Write a program that prints the balance of an account after the first, second, and
 *third year. The account has an initial balance of£1,000 and earns 5 percent interest
 *per year
 * @author Lyle
 *
 */
public class P1_04 {

	public static void main(String[] args) {
		double balance = 1000;
		final double interest = 1.05;
		
		System.out.println("Opening balance: " + balance);
		System.out.printf("Interest: %.0f", (interest -1) * 100);
		System.out.print("%\n\n");
		for(int i = 1; i <= 3; i++) {
			balance *= interest;
			System.out.printf("Year " + i + " balance: £%.2f\n", balance);
		}

	}

}
