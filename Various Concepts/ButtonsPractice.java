
/**
 * @author Lyle
 * Simply a refresher using the accompanying Buttons class to refresh some 
 * elementary programming concepts.
 */
public class ButtonsPractice {

	public static void main(String[] args) {

		Buttons myButtonProgram = new Buttons(15);
		System.out.println(myButtonProgram.getNumberOfButtons());

		myButtonProgram.setNumberOfButtons(45);
		System.out.println(myButtonProgram.getNumberOfButtons());

		Buttons set1 = new Buttons(200);
		Buttons set2 = new Buttons(300);

		int x = set1.getNumberOfButtons();
		int y = set2.getNumberOfButtons();
		int total = x + y;
		System.out.printf("The total is %s", total);

	}

}
