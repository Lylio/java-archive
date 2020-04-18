
/**
 * P9.3 Modify the checkAnswer method of the Question class so that it does not take into
account different spaces or upper/lowercase characters. For example, the response
"JAMES gosling" should match an answer of "James Gosling".
 * @author Lyle
 *
 */
public class P9_03 {

	public static void main(String[] args) {
		
		Question q1 = new Question();
		q1.setText("What is the capital of Spain?");
		q1.setAnswer("Madrid");
		
		q1.display();
		System.out.println(q1.checkAnswer("madrid"));
		

	}

}
