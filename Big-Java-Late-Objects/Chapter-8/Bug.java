
public class Bug {
	
	private int currentPosition;
	private String currentDirection;
	
	Bug(int initialPosition) {
		currentDirection = "East";
		currentPosition = initialPosition;		
	}
	
	public void move() {
		if(currentDirection.equals("East")) {
			currentPosition++;
		} else {
			currentPosition--;
		}
	}
	
	public void turn() {
		if(currentDirection.equals("East")) {
			currentDirection = "West";
		} else {currentDirection = "East";}
	}
	
	public String getDirection() {
		return currentDirection;
	}
	
	public int getPosition() {
		return currentPosition;
	}

}
