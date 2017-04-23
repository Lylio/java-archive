import java.util.Scanner;
/**
 * Practice of the switch statement
 * @author Lyle
 *
 */
public class SwitchPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dayNum;
		String day;
		
		System.out.print("Please enter day of the week 1-7: ");
		dayNum = in.nextInt();
		in.close();
		
		switch(dayNum) {
		case 1 : day = "Monday";
			break;
		case 2 : day = "Tuesday";
			break;
		case 3 : day = "Wednesday";
			break;
		case 4 : day = "Thursday";
			break;
		case 5 : day = "Friday";
			break;
		case 6 : day = "Saturday";
			break;
		case 7 : day = "Sunday";
			break;
		default: day = "results in an error: number must be between 1-7.";
			break;
			
		}
		
		System.out.println("Day " + dayNum + " is " + day);

	}

}
