import java.util.ArrayList;

public class CountDownApp {
	
	public static void main (String[] args) {
		
		Thread clock = new CountDownClock();
		
		ArrayList<Runnable> events = new ArrayList<Runnable>();
		events.add(new Adverts());
		events.add(new LaunchEvent(16, "Flood the pad!"));
		events.add(new LaunchEvent(6, "Start engines!"));
		events.add(new LaunchEvent(0, "LIFTOFF!"));
		

		clock.start();
		for(Runnable e : events) {
			new Thread(e).start();
		}
	}

}
