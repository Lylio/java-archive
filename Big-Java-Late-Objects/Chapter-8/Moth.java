
public class Moth {
	
	private double lightPosition = 300.0;
	private double currentPosition;
	
	public Moth(double initialPosition) {
		currentPosition = initialPosition;
	}
	
	public void moveToLight() {
		double distance = (lightPosition - currentPosition) / 2;
		currentPosition += distance;
	}
	
	public void getPosition() {
		System.out.println("Current position: " + currentPosition);
	}
	
	public void getLightPosition() {
		System.out.println("Light position: " + lightPosition);
	}

}
