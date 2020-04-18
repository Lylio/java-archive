
public class Car {
	private double tankLevel = 0; //in gallons
	private double fuelEfficiency; //in miles per gallon
	private int totalMiles;
	
	public Car(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public void addGas(double gas) {
		tankLevel += gas;
	}
	
	public void drive(int distance) {
		totalMiles += distance;
		tankLevel = tankLevel - (distance / fuelEfficiency);
		if(tankLevel <= 0) {
			System.out.println("Alert! Car out of gas!");
			tankLevel = 0;
		}
	}
	
	public double getGasLevel() {
		return tankLevel;
	}
	
	public int getTotalMiles() {
		return totalMiles;
	}
	

}
