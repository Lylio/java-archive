
public class SplitString2 {

	public static void main(String[] args) {
		
		String sentence = "Load up on guns and kill your friends";
		
		
		//Convert string to array of individual words
		String[] words = sentence.split(" ");
		
		System.out.println(words[3]); //guns
		
		for(String i : words) {System.out.println(i);}
		

	}

}
