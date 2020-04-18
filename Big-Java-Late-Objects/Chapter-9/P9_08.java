
/**
 * P9.8 Implement a superclass Person. Make two classes, Student and Instructor, that inherit
from Person. A person has a name and a year of birth. A student has a major, and
an instructor has a salary. Write the class declarations, the constructors, and the
methods toString for all classes. Supply a test program that tests these classes and
methods.
 * @author Lyle
 *
 */
public class P9_08 {

	public static void main(String[] args) {
		
		
		UGStudent samMickle = new UGStudent("Sam Mickle", 1992, "Philosophy");
		System.out.println(samMickle.toString());
		
		Instructor profDaveHarrison = new Instructor("Dave Harrison", 1958, 40000);
		System.out.println(profDaveHarrison.toString());
		
	}

}
