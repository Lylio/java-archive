
/**
 * Practice with halving numbers with recursion, and a demonstration
 * of how to reverse the print order
 * @author Lyle
 *
 */
public class HalvingIntegers {

	public static void main(String[] args) {
		
		//recursion halving integers method
		
		halving1(50); //50 25 12 6 3 1 expected
		System.out.println();
		halving2(50); // 1 3 6 12 25 50 expected
		
		
	}
	
	public static void halving1(int num) {
		if(num <= 1) {
			System.out.print(num);
		} else {
			System.out.print(num + " ");
			halving1(num / 2);
		}
	}
	
	public static void halving2(int num) {
		if(num <= 1) {
			System.out.print(num);
		} else {
			//Note: Reversing the following two statements reverses the print 
			//order - and notice the space and concatenation is swapped
			halving2(num / 2); 
			System.out.print(" " + num);
		}
	}
	
}