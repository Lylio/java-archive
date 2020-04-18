
/**
 * P8.1 We want to add a button to the tally counter in Section 8.2 that allows an operator to
 * undo an accidental button click. Provide a method
 * public void undo()
 * that simulates such a button. As an added precaution, make sure that the operator
 * cannot click the undo button more often than the count button.
 * @author Lyle
 *
 */
public class P8_01 {

	public static void main(String[] args) {
		
		Counter tally = new Counter();
		tally.count();
		tally.count();
		tally.count();
		tally.count();
		System.out.println(tally.getValue());
		
		tally.undo();
		System.out.println(tally.getValue());
		
		tally.undo();
		tally.undo();
		tally.undo();
		tally.undo();
		tally.undo();
		System.out.println(tally.getValue());

	}

}
