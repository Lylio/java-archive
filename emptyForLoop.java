import java.util.Scanner;

public class emptyForLoop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int userNum;
		int total = 0;


		System.out.println("Please enter a number (-1 to quit)"); 
		for(;;) {
			userNum = in.nextInt();
			if(userNum == -1) {
				break;
			} else {
				total += userNum;
			}
		}

		System.out.println("Total " + total);

	}

}
