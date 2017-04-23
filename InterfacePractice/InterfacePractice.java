
public class InterfacePractice implements GreetingsInterface {

	public static void main(String[] args) {
		
	InterfacePractice test = new InterfacePractice();
	test.hello();

	}
	
	public void hello() {
		System.out.println("Hello!");
	}
	
	public void handShake() {
		System.out.println("*SHAKES HAND*");
	}

}
