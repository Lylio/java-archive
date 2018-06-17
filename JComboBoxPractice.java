import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JComboBoxPractice extends JFrame {
 

private static String[] message = {"zombies", "weapon", "lol"};
JComboBox box = new JComboBox(message); 
JLabel lblText = new JLabel();

public JComboBoxPractice(){
 
 super("The title");
 setLayout(new FlowLayout());
 
 
 box.setSelectedIndex(1);
 box.addActionListener(box);
 add(box);
 add(lblText);
 
}


public void ActionPerformed(ActionEvent e){

 if (e.getSource() == box){
  JComboBox cb = (JComboBox)e.getSource();
  String msg = (String)cb.getSelectedItem();

switch(msg){
case "Message 1" : lblText.setText("Usted ha seleccionado opcion 1");
break;
case "Message 2" : lblText.setText("Usted ha seleccionado opcion 2");
break;
case "Message 3" : lblText.setText("Usted ha seleccionado opcion 3");


  
 }
}


 }
}