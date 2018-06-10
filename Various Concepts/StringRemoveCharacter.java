
public class StringRemoveCharacter {

	public static void main(String[] args) {
		
		System.out.println(killStar("alp*habet"));


	}

	public static String killStar(String str) {

		int len = str.length();
		String finalString = "";

		for(int i = 0; i < len; i++) {
			if(str.charAt(i) != '*') {
				finalString += str.charAt(i);
			}
		}

		return finalString;

	}

}