
/**
 * P9.2 Add a class FillInQuestion to the question hierarchy of Section 9.1. Such a question is
constructed with a string that contains the answer, surrounded by _ _, for example,
"The inventor of Java was _James Gosling_". The question should be displayed as
The inventor of Java was _____
 * @author Lyle
 *
 */
public class P9_02 {

	public static void main(String[] args) {
		
		FillInQuestion q1 = new FillInQuestion();
		q1.setText("The inventor of Java was _James Gosling_");
		q1.display();
		System.out.println(q1.checkAnswer("James Gosling"));

	}

}
