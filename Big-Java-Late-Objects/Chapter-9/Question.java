
public class Question {
	
	    private String text;
	    private String answer;

	    public Question() {
	        this.text = "";
	        this.answer = "";
	    }

	    public String getText() {
	        return this.text;
	    }

	    public void setText(String questionText) {
	        this.text = questionText;
	    }

	    public String getAnswer() {
	        return this.answer;
	    }

	    public void setAnswer(String correctResponse) {
	        this.answer = correctResponse;
	        answer = answer.toLowerCase();
	    }

	    public boolean checkAnswer(String response) {
	    	
	    	response = response.toLowerCase();
	    	return response.equals(answer);
	    }

	    public void display() {
	        System.out.println(this.text);
	    }
	    
	    public String toString() {
	    	return getClass() + ": " + getText();
	    }

	}


