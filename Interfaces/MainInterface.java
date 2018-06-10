
public class MainInterface implements GreetingsInterface, FarewellInterface {

	@Override
	public void goodbye() {
		System.out.println("So long!");
		
	}

	@Override
	public void gesture() {
		System.out.println("*WAVES!*");
		
	}

	@Override
	public void tears() {
		System.out.println("*SOB!* *SOB!*");
		
	}

	@Override
	public void hello() {
		System.out.println("Howdy do?!");
		
	}

	@Override
	public void handShake() {
		System.out.println("*SHAKES HAND*");
		
	}

	@Override
	public void smile() {
		System.out.println(":D");
		
	}

	@Override
	public void chitChat() {
		System.out.println("Nice weather for ducks!");
		
	}

	
}
