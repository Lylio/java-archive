import java.util.Date;

public class myRunnable2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			Date now = new Date();
			System.out.println("myRunnable2 thread running at " + now);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}