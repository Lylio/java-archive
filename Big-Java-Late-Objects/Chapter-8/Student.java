
public class Student {
	
	private String name;
	private double totalQuizScore;
	private int numberOfQuizzes;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addQuiz(int score) {
		totalQuizScore += score;
		numberOfQuizzes++;
	}
	
	public double getTotalScore() {
		return totalQuizScore;
	}
	
	public double getAverageScore() {
		return totalQuizScore / numberOfQuizzes;
	}
	

}
