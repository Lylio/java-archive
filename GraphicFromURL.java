import java.awt.BorderLayout;
import java.awt.Image;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GraphicFromURL {
  public static void main(String[] argv) throws Exception {
    URL url = new URL("http://www.insurancechat.co.za/wp-content/uploads/2017/09/yellow_smiley_face_stickers-r61c4d7a911824bccbccc41c14d4f6cb3_v9waf_8byvr_324.jpg");
    Image image = ImageIO.read(url);

    JFrame frame = new JFrame();
    JLabel logoLabel = new JLabel(new ImageIcon(image));
    frame.getContentPane().add(logoLabel, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
}