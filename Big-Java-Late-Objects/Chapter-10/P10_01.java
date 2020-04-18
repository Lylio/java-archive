import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

/**p10.1 Write a program that shows a square frame filled with 100 buttons labeled 1 to 100.
Nothing needs to happen when you press any of the buttons.
 * @author Lyle
 *
 */
public class P10_01 {

	public static void main(String[] args) {
		
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;
		
		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		JButton button= new JButton("Click");
		JButton button2= new JButton("Click");
		panel.add(button);
		panel.add(button2);
		frame.add(panel);
		

	}

}
