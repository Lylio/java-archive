import java.util.Scanner;
public class FillInQuestion extends Question {

	@Override
	public void setText(String questionText) {
		Scanner in = new Scanner(questionText);
		in.useDelimiter("_");
		String question = in.next();
		String answer = in.next();
		 question += "____ ______";
		in.close();
		
		super.setText(question);
		super.setAnswer(answer);
		
	}
}
