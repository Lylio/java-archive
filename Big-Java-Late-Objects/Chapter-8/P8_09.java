
/**
 * P8.9 Declare a class ComboLock that works like the combination lock
 * in a gym locker, as shown here. The lock is constructed with a
 * combination—
 * three numbers between 0 and 39. The reset method
 * resets the dial so that it points to 0. The turnLeft and turnRight
 * methods turn the dial by a given number of ticks to the left or
 * right. The open method attempts to open the lock. The lock opens
 * if the user first turned it right to the first number in the combination,
 * then left to the second, and then right to the third.
 * public class ComboLock
 * {
 * . . .
 * public ComboLock(int secret1, int secret2, int secret3) { . . . }
 * public void reset() { . . . }
 * public void turnLeft(int ticks) { . . . }
 * public void turnRight(int ticks) { . . . }
 * public boolean open() { . . . }
 * }
 * @author Lyle
 *
 */
public class P8_09 {

	public static void main(String[] args) {
		
		ComboLock lock = new ComboLock(7, 2, 4);
		
		lock.turnRight(8);
		lock.turnLeft(2);
		lock.turnRight2(2);
		lock.open();
		
		lock.reset();
		
		lock.turnRight(7);
		lock.turnLeft(2);
		lock.turnRight2(4);
		lock.open();

	}

}
