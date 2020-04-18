
/**Add a class NumericQuestion to the question hierarchy of Section 9.1. If the response
and the expected answer differ by no more than 0.01, then accept the response as
correct.
 * P9.1
 * @author Lyle
 *
 */
public class P9_01 {

	public static void main(String[] args) {
		
		NumericQuestion q1 = new NumericQuestion();
		
		q1.setText("What is Pi to two decimal places?");
		q1.setAnswer("3.14");
		
		q1.display();
		System.out.println(q1.checkAnswer("3.16"));
		

	}

}
