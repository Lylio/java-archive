import java.util.Scanner;

/**
 * P3.17 When two points in time are compared, each given as hours (in military time, ranging
 * from 0 and 23) and minutes, the following pseudocode determines which comes
 * first.
 * If hour1 < hour2
 * time1 comes first.
 * Else if hour1 and hour2 are the same
 * If minute1 < minute2
 * time1 comes first.
 * Else if minute1 and minute2 are the same
 * time1 and time2 are the same.
 * Else
 * time2 comes first.
 * Else
 * time2 comes first.
 * Write a program that prompts the user for two points in time and prints the time that
 * comes first, then the other time.
 * @author Lyle
 *
 */
public class P3_17 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Please enter first time: ");
		 String time1 = in.nextLine();
		 System.out.println("Please enter second time: ");
		 String time2 = in.nextLine();
		 String first = "";
		 String second = "";
		 boolean equalTimes = false;
		 in.close();
		 
		 int time1Hours = Integer.parseInt(time1.substring(0, 2));
		 int time1Minutes = Integer.parseInt(time1.substring(2, 4));
		 int time2Hours = Integer.parseInt(time2.substring(0, 2));
		 int time2Minutes = Integer.parseInt(time2.substring(2, 4));
		 
		 if(time1Hours < time2Hours) {
			 first = time1;
			 second = time2;
		 } else if(time1Hours == time2Hours) {
			 if(time1Minutes < time2Minutes) {
				 first = time1;
				 second = time2;
			 } else if(time1Minutes == time2Minutes) {
				 System.out.println("Times are the same.");
				 equalTimes = true;
			 } else {
				 first = time2;
				 second = time1;
			 }
		 } else {
			 first = time2;
			 second = time1;
		 }
		 
		if(!equalTimes) {
		 System.out.println(first + " comes before " + second);
		}
	}

}
