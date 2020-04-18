

/**
 * P6.16 It is a well-researched fact that men in a restroom generally prefer to maximize
 * their distance from already occupied stalls, by occupying the middle of the longest
 * sequence of unoccupied places.
 * For example, consider the situation where ten stalls are empty.
 * The first visitor will occupy a middle position:
 * _ _ _ _ _ X _ _ _ _
 * The next visitor will be in the middle of the empty area at the left.
 * _ _ X _ _ X _ _ _ _
 * Write a program that reads the number of stalls and then prints out diagrams in the
 * format given above when the stalls become filled, one at a time. Hint: Use an array of
 * boolean values to indicate whether a stall is occupied.
 * P6.16
 * @author Lyle
 *
 */
public class P6_16 {

	public static void main(String[] args) {
		
		boolean[] stalls = new boolean[10];
		
		
		
	}
	
	public static void printStalls(boolean[] stalls) {
		
		for(int i = 0; i < stalls.length; i++) {
			if(stalls[i] == false) {
				System.out.print(" _ ");
			} else {
				System.out.print(" X ");
			}
		}
		System.out.println("\n");
	}
	
	public static void choice(boolean[] stalls) {
		
		for(int i = 0; i < stalls.length; i++) {
			
		}
		
	}

}
