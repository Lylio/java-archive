import java.util.Scanner;
/**
 * Easter Sunday is the first Sunday
 * after the first full moon of spring. To compute
 * the date, you can use this algorithm, invented by the mathematician
 * Carl Friedrich Gauss in 1800:
 * @author Lyle
 *
 */
public class P2_21 {

	public static void main(String[] args) {
		
		int monthNum = 12;
		String month = null;
		String months = "January February March April May June July August September October November December";
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter year: ");
		int y = in.nextInt();
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;
		
		monthNum = n;
		switch(monthNum) {
		case 1: month = months.substring(0, 7);
		break;
		case 2: month = months.substring(8, 16);
		break;
		case 3: month = months.substring(17, 22);
		break;
		case 4: month = months.substring(23, 28);
		break;
		case 5: month = months.substring(29, 32);
		break;
		case 6: month = months.substring(33, 37);
		break;
		case 7: month = months.substring(38, 42);
		break;
		case 8: month = months.substring(43, 49);
		break;
		case 9: month = months.substring(50, 59);
		break;
		case 10: month = months.substring(60, 67);
		break;
		case 11: month = months.substring(68, 76);
		break;
		case 12: month = months.substring(77, 85);
		break;
		}
		
		System.out.println(p + " of " + month);
		in.close();
	}

}
