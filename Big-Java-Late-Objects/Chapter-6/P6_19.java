

/**
 * P6.19
 * Implement the following algorithm to construct magic n × n squares; it works only if
 * n is odd.
 * Set row = n - 1, column = n / 2.
 * For k = 1 ... n * n
 * Place k at [row][column].
 * Increment row and column.
 * If the row or column is n, replace it with 0.
 * If the element at [row][column] has already been filled
 * Set row and column to their previous values.
 * Decrement row.
 * Here is the 5 × 5 square that you get if you follow this method:
 * Write a program whose input is the number n and whose output is the magic square
 * of order n if n is odd.
 * @author Lyle
 *
 */
public class P6_19 {

	public static void main(String[] args) {
		
	}

}
