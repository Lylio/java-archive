import javax.swing.*;
import java.awt.event.*;

public class ClickMe extends JFrame implements ActionListener {

	public static void main(String[] args) {
		
		new ClickMe();

	}
	
	private JButton button1;
	private JButton button2;
	
	public ClickMe() {
		this.setSize(300, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("I'm listening");
		
		JPanel panel = new JPanel();
		button1 = new JButton("click me");
		button1.addActionListener(this);
		
		button2 = new JButton("click me");
		button2.addActionListener(this);
		
		panel.add(button1);
		panel.add(button2);
		this.add(panel);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			System.out.println("button 1 clicked");
		} else if (e.getSource() == button2) {
			System.out.println("Button 2 clicked");
		}
	}

}
