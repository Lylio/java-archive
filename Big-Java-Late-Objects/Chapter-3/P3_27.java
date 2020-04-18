import java.util.Scanner;

/**
 * P3.27Write a program that asks the user to enter a month (1 for January, 2 for February,
 * and so on) and then prints the number of days in the month. For February, print “28
 * or 29 days”.
 * Enter a month: 5
 * 30 days
 * Do not use a separate if/else branch for each month. Use Boolean operators.
 * @author Lyle
 *
 */
public class P3_27 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter month (1 = January, etc.): ");
		int month = in.nextInt();
		boolean thirty = false;
		boolean thirtyOne = false;
		boolean feb = false;
		
		if(month == 2) {
			feb = true;
		} else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 9 || month == 10 || month == 12) {
			thirtyOne = true;
		} else {
			thirty = true;
		}
		
		if(feb == true) {febDays();}
		if(thirty == true) {thirtyDays();}
		if(thirtyOne == true) {thirtyOneDays();}
		in.close();
	}
	
	public static void febDays() {
		System.out.println("28 or 29 days");
	}
	
	public static void thirtyDays() {
		System.out.println("30 days");
	}
	
	public static void thirtyOneDays() {
		System.out.println("31 days");
	}

}
