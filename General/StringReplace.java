
public class StringReplace {

	public static void main(String[] args) {
		
		String str = "alphabet";
		str = str.replace('a', 'o');
		System.out.println(str);
		
		String str2 = "every day in every way I'm getting better and better";
		str2 = str2.replaceAll("every", "rainy");
		System.out.println(str2);
		
		String str3 = "hippopotamus";
		str3 = str3.replace("pp", "rr");
		System.out.println(str3);
		
		String str4 = "Picture yourself in a boat in a river";
		str4 = str4.replace("in a", "on a");
		System.out.println(str4);
	}

}
