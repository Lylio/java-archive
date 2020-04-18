
/**
 * P8.7 Implement a class Student. For the purpose of this exercise, a student has a name
 * and a total quiz score. Supply an appropriate constructor and methods getName(),
 * addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the latter, you
 * also need to store the number of quizzes that the student took.
 * @author Lyle
 *
 */
public class P8_07 {

	public static void main(String[] args) {
		
		Student sarahSmith = new Student("Sarah Smith");
		sarahSmith.addQuiz(87);
		sarahSmith.addQuiz(92);
		sarahSmith.addQuiz(76);
		sarahSmith.addQuiz(86);
		
		System.out.printf("%.2f", sarahSmith.getAverageScore());
		

	}

}
