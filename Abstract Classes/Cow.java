
public class Cow extends Animal {

	@Override
	public void makeNoise() {
		System.out.println("Moo! MOOoooO!");
		
	}

	@Override
	public boolean isMammal() {
		System.out.println("True - is a mammal");
		return true;
	}

}
