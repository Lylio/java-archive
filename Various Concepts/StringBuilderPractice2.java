
/**
 * Duplicates each character in a String using StringBuilder
 * @author Lyle
 *
 */
public class StringBuilderPractice2 {

	public static void main(String[] args) {
		
		String str = "Hippopotamus";
		char ch;
		StringBuilder strBuild = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			strBuild.append(ch);
			strBuild.append(ch);
		}
		
		System.out.println(strBuild);

	}

}
