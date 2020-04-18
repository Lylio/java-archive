import java.util.Arrays;
/**
 * P4.23 The Drunkard’s Walk. A drunkard in a grid of streets randomly picks one of four
 * directions and stumbles to the next intersection, then again randomly picks one of
 * four directions, and so on. You might think that on average the drunkard doesn’t
 * move very far because the choices cancel each other out, but that is actually not the
 * case.
 * Represent locations as integer pairs (x, y). Implement the drunkard’s walk over 100
 * intersections, starting at (0, 0), and print the ending location.
 * @author Lyle
 *
 */
public class P4_23 {

	public static void main(String[] args) {
		
		int[] position = {0, 0};
		
		int i = 1;
		while(i < 100) {
			move(position);
			i++;
		}
		
		System.out.println(Arrays.toString(position));
		
		
	}
	
	public static void move(int[] position) {
		
		int randMove = (int)(Math.random() * 4) + 1; //1 = North (y + 1); 2 = East (x + 1); 3 = South (y - 1); 4 = West (x - 1)
		
		if(randMove == 1) {
			position[1] += 1;
		} else if(randMove == 2) {
			position[0] += 1;
		}  else if(randMove == 3) {
			position[1] -= 1;
		}   else if(randMove == 4) {
			position[0] -= 1;
		}
	}

}
