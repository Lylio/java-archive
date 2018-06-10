
public class Adverts implements Runnable {
	
	public void run() {
		try {
		Thread.sleep(5000);
		System.out.println("Eat some Funions, today!");
		} catch (InterruptedException e) {}
	}

}
