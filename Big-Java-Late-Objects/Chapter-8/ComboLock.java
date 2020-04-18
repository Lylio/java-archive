
public class ComboLock {
	
	private int secret1;
	private int secret2;
	private int secret3;
	private int leftTicks;
	private int rightTicks1;
	private int rightTicks2;

	
	//Constructor
	public ComboLock(int secret1, int secret2, int secret3) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
	}
	
	//turn left method
	public void turnLeft(int ticks) {
		leftTicks = ticks;
	}
	
	//first turn right method
	public void turnRight(int ticks) {
		rightTicks1 = ticks;
	}
	
	//second turn right method
	public void turnRight2(int ticks) {
		rightTicks2 = ticks;
	}
	
	//open method
	public boolean open() {
		if((rightTicks1 == secret1) && (leftTicks == secret2) && (rightTicks2 == secret3)) {
			System.out.println("ACCESS GRANTED");
			return true;
		} else {
			System.out.println("ACCESS DENIED");
			return false;
		}
	
	}
	
	//reset method
	public void reset() {
		leftTicks = 0;
		rightTicks1 = 0;
		rightTicks2 = 0;
		System.out.println("*RESET*");
	}
	
	public void getSecretNumbers() {
		System.out.println("Secret 1 is: " + secret1);
		System.out.println("Secret 2 is: " + secret2);
		System.out.println("Secret 3 is: " + secret3);
	}


}
