import javax.swing.JOptionPane;

/**
 * P1.15 Modify the program to print “Hello, name!”, displaying the name that the user
 * typed in.
 * @author Lyle
 *
 */
public class P1_15 {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, String.format("Hello %s!", name));
	}
}