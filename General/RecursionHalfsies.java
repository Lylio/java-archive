
public class RecursionHalfsies {

	public static void main(String[] args) {
		
		halfsies(1); // 1 expected
		
		System.out.println();
		
		halfsies(16); //1, 2, 4, 8, 16 expected
		
		System.out.println();
		
		halfsies(100); // 1, 3, 6, 12, 25, 50, 100 expected
		
		
	}
	
	public static void halfsies(int n) {
		if (n <= 1)
			System.out.print(n);
		else {
			halfsies(n / 2);
			System.out.print(", " + n);
		}
	}


}
