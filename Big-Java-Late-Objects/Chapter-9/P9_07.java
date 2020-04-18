
/**
 * P9.7 Provide toString methods for the Question and ChoiceQuestion classes.
 * @author Lyle
 *
 */
public class P9_07 {

	public static void main(String[] args) {
		
		Question q1 = new Question();
		q1.setText("Where is Paris?");
		q1.setAnswer("France");
	
		
		System.out.println(q1.toString());
		
		ChoiceQuestion q2 = new ChoiceQuestion();
		q2.setText("Which snooker ball is worth 5 points?");
		q2.addChoice("pink", false);
		q2.addChoice("green", false);
		q2.addChoice("blue", true);
		
		System.out.println(q2.toString());

	}

}
