
public abstract class Animal {
	
	public void Food(String food) {
		System.out.println("I like to eat " + food);
	}
	
	public void Continent(String continent) {
		System.out.println("I live in " + continent);
	}
	
	public abstract void makeNoise();
	
	public abstract boolean isMammal();

}
