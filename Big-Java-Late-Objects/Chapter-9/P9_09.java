
/**
 * P9.9 Make a class Employee with a name and salary. Make a class Manager inherit from
Employee. Add an instance variable, named department, of type String. Supply a method
toString that prints the manager’s name, department, and salary. Make a class Executive
inherit from Manager. Supply appropriate toString methods for all classes. Supply
a test program that tests these classes and methods.
 * @author Lyle
 *
 */
public class P9_09 {

	public static void main(String[] args) {
		
		Manager GSmith = new Manager("Gary Smith", 27000, "Accounting");
		System.out.println(GSmith.toString());
		
		Executive AWhite = new Executive("Audrey White", 26000, "Human Resources");
		System.out.println(AWhite.toString());

	}

}
