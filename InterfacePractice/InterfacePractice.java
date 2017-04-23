
public class InterfacePractice implements GreetingsInterface, FarewellInterface {

	public static void main(String[] args) {
		
	InterfacePractice test = new InterfacePractice();
	test.hello();
	
	InterfacePractice test2 = new InterfacePractice();
	test2.gesture();
	
	test.smile();
	

	}
	
	@Override
	public void hello() {
		System.out.println("Hello!");
	}
	
	@Override
	public void handShake() {
		System.out.println("*SHAKES HAND*");
	}

	@Override
	public void smile() {
		System.out.println(":)");
		
	}

	@Override
	public void chitChat() {
		System.out.println("Nice weather for ducks!");
		
	}

	@Override
	public void goodbye() {
		System.out.println("Cheerie bye!");
		
	}

	@Override
	public void gesture() {
		System.out.println("*WAVES!*");
		
	}

	@Override
	public void tears() {
		System.out.println("Sob! I'll miss you!");
		
	}

}
