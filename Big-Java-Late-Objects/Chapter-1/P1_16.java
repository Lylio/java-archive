import javax.swing.JOptionPane;
/**
 * P1.16 Modify the program from Exercise P1.15 so that the dialog continues with the message
 * “My name is Hal! What would you like me to do?” Discard the user’s input and
 * display a message
 * @author Lyle
 *
 */
public class P1_16 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, String.format("Hello %s!", name));
		JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
		JOptionPane.showMessageDialog(null, String.format("I\'m sorry, %s. I'm afraid I can't do that.", name));

	}

}
