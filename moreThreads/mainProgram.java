
public class mainProgram {

	public static void main(String[] args) {
		
		Runnable r = new myRunnable();
		Runnable r2 = new myRunnable2();
		
		Thread t = new Thread(r);
		Thread t2 = new Thread(r2);
		
		t.start();
		t2.start();

	}

}
