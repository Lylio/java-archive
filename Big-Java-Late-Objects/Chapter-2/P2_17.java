import java.util.Scanner;
/**
 * P2.17 Write a program that reads two times in military format (0900, 1730) and prints the
 * number of hours and minutes between the two times.
 * @author Lyle
 *
 */
public class P2_17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int minutes;
		int hours = 0;
		final int MINUTES_IN_HOUR = 60;
		final int MINUTES_IN_DAY = 1440;
		System.out.print("Please enter first time: ");
		int time1 = in.nextInt();
		System.out.print("Please enter second time: ");
		int time2 = in.nextInt();
		in.close();
		
		//convert times to minutes
		int time1ToMinutes = (time1 / 100 * MINUTES_IN_HOUR) + time1 % 100;
		int time2ToMinutes = (time2 / 100 * MINUTES_IN_HOUR) + time2 % 100;
		if(time1ToMinutes > time2ToMinutes) {
			minutes = time1ToMinutes - time2ToMinutes; } 
		else {minutes = time2ToMinutes - time1ToMinutes;}
		
		minutes = (MINUTES_IN_DAY + minutes) % MINUTES_IN_DAY;
		hours = minutes / 60; 
		minutes %= 60;
		
		System.out.printf("%d hours and %d minutes", hours, minutes);
		
		

	}

}
