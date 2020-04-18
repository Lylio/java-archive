
/**
 * P8.2 Simulate a tally counter that can be used to admit a limited number of people. First,
 * the limit is set with a call
 * public void setLimit(int maximum)
 * If the count button was clicked more often than the limit, simulate an alarm by
 * printing out a message “Limit exceeded”.
 * @author Lyle
 *
 */
public class P8_02 {

	public static void main(String[] args) {
		
		CounterLimit admissions = new CounterLimit();
		
		admissions.setLimit(5);
		
		admissions.count();
		admissions.count();
		admissions.count();
		System.out.println(admissions.getCount());
		
		admissions.count();
		admissions.count();
		admissions.count();
		System.out.println(admissions.getCount());

	}

}
