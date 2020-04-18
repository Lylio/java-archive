
/**
 * P2.19 Write a program that transforms numbers 1, 2, 3, …, 12
 * into the corresponding month names January, February,
 * March
 * @author Lyle
 *
 */
public class P2_19 {

	public static void main(String[] args) {
		
		int monthNum = 12;
		String month = null;
		String months = "January February March April May June July August September October November December";


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
		
		System.out.println(month);
	}

}
