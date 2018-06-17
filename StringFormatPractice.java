
public class StringFormatPractice {

	public static void main(String[] args) {
		
		int x = 15;
		int y = 34;
		String name = "Jimmy";
		String fruit = "apples";
		String weirdSentence = String.format("%s likes to eat fresh %d %ss.", fruit, x, name);
		
		
		System.out.println(String.format("The value of x is %d and the value of y is %d", x, y));
		
		System.out.println(String.format("%s likes to eat fresh %s.", name, fruit));
		
		System.out.println(weirdSentence);
	}

}
