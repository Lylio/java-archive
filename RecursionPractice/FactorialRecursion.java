
public class FactorialRecursion {

	public static void main(String[] args) {
		
		System.out.println(factorial(6)); //720

	}
	
	public static int factorial(int num) {
		int total;
		if(num == 1) {
			return 1;
		} 
		
		total = num * factorial(num - 1);
		return total;
	}

}
