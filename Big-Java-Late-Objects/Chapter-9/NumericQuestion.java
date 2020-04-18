
public class NumericQuestion extends Question {
	

	
	@Override
	public boolean checkAnswer(String response) {
    	
		double expectedAnswer = Double.parseDouble(getAnswer());
		double responseAnswer = Double.parseDouble(response);

		return Math.abs(expectedAnswer - responseAnswer) <= 0.01;

    }

}
