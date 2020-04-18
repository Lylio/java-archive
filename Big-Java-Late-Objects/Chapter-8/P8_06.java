
/**
 * P8.6 Implement a class Car with the following properties. A car has a certain
 * fuel efficiency (measured in miles/gallon) and a certain amount of fuel
 * in the gas tank. The efficiency is specified in the constructor, and the
 * initial fuel level is 0. Supply a method drive that simulates driving the
 * car for a certain distance, reducing the fuel level in the gas tank, and methods getGas-
 * Level, to return the current fuel level, and addGas, to tank up. Sample usage:
 * Car myHybrid = new Car(50); // 50 miles per gallon
 * myHybrid.addGas(20); // Tank 20 gallons
 * myHybrid.drive(100); // Drive 100 miles
 * System.out.println(myHybrid.getGasLevel()); // Print fuel remaining
 * @author Lyle
 *
 */
public class P8_06 {

	public static void main(String[] args) {
		
		Car fordCMax = new Car(38);
		fordCMax.addGas(7);
		fordCMax.drive(100);
		
		System.out.printf("Tank level is %.2f gallons after travelling %d miles\n", fordCMax.getGasLevel(), fordCMax.getTotalMiles());
		
		fordCMax.drive(120);
		
		System.out.printf("Tank level is %.2f gallons after travelling %d miles\n", fordCMax.getGasLevel(), fordCMax.getTotalMiles());
		
		fordCMax.drive(80);
		
		System.out.printf("Tank level is %.2f gallons after travelling %d miles\n", fordCMax.getGasLevel(), fordCMax.getTotalMiles());
		
		
		
	}

}
