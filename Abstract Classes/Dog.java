
public class Dog extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("Bark! Bark!");
		
	}

	@Override
	public boolean isMammal() {
		System.out.println("True - is a mammal");
		return true;
		
	}

}
