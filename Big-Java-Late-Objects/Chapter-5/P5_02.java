
 /**
  * P5.2 Write the following methods and provide a program to test them.
  * a. boolean allTheSame(double x, double y, double z), returning true if the arguments
  * are all the same
  * b. boolean allDifferent(double x, double y, double z), returning true if the arguments
  * are all different
  * c. boolean sorted(double x, double y, double z), returning true if the arguments are
  * sorted, with the smallest one coming first
 * @author Lyle
 *
 */
public class P5_02 {

	public static void main(String[] args) {
		
		System.out.println(allSorted(4.6, 4.8, 4.9));

	}
	
	public static boolean allTheSame(double x, double y, double z) {
		if(x == y && y == z) {
			return true;
		} else {return false;}
	}
	
	public static boolean allDifferent(double x, double y, double z) {
		if(x != y && y != z) {
			return true;
		} else {return false;}
	}
	
	public static boolean allSorted(double x, double y, double z) {
		if(x < y && y < z) {
			return true;
		} else {return false;}
	}

}
