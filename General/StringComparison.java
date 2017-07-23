
public class StringComparison {

	public static void main(String[] args) {
		
		String word1 = "Alphabet";
		String word2 = "alPhaBet";
		
		//Comparison with case taken into account
		if(word1.equals(word2)) {
			System.out.println("Comparison is true (case considered)");
		} else {
			System.out.println("Comparison is false (case considered)");
		}
		
		//Comparison with case ignored
		if(word1.equalsIgnoreCase(word2)) {
			System.out.println("Comparison is true (case ignored)");
		} else {
			System.out.println("Comparison is false (case ignored)");
		
		}

	}

}
