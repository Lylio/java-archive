import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * P1.17 Then modify it to show a different greeting and image.
 * @author Lyle
 *
 */
public class P1_17 {
	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("http://sr.photos1.fotosearch.com/bthumb/CSP/CSP015/k0152710.jpg");
		JOptionPane.showMessageDialog(null, "Ahoy!", "Java Panes Are Cool", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}