
 /**
  * P5.1 Write the following methods and provide a program to test them.
  * a. double smallest(double x, double y, double z), returning the smallest of the
  * arguments
  * b. double average(double x, double y, double z), returning the average of the
  * arguments
  * @author Lyle
  *
  */
public class P5_01 {

	public static void main(String[] args) {
		
		System.out.println(average(2.5, 1.2, 3.4));
		
	}
	
	public static double smallest(double x, double y, double z) {
		if(x < y && x < z) {
			return x;
		} else if (y < x && y < z) {
			return y;
		} else {
			return z;
		}
	}
	
	public static double average(double x, double y, double z) {
		double average = (x + y + z) / 3;
		return average;
	}

}
