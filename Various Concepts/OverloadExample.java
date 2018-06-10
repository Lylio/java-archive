

/**
 * Program which demonstrates how methods can be overloaded
 * (have the same name, but different parameters)
 * @author Lyle
 *
 */
public class OverloadExample { 

	public static void main(String[] args) {

		
		overloadExample(3, 7);
		overloadExample("Blessed are the worms");
	}
	
	//a list of overloaded methods
	
	public static void overloadExample() {
		System.out.println("No parameters");
	}
	
	public static void overloadExample(int a) {
		System.out.printf("\nParamater a is %d", a);
	}
	
	public static void overloadExample(int a, int b) {
		System.out.printf("\nParameter a is %d | Parameter b is %d", a, b);
	}
	
	public static void overloadExample(String sentence) {
		System.out.printf("\nThe sentence you wrote is: %s", sentence);
	}
}