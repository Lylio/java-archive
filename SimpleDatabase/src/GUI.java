import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {


    Database database = new Database();
    private JLabel fNameLabel, lNameLabel, ageLabel, townLabel;
    private JTextField fNameField, lNameField, ageField, townField;
    private JButton submitButton;

    private String fName;
    private  String lName;
    private int age;
    private String town;

    private final int FRAME_WIDTH = 500;
    private final int FRAME_HEIGHT = 200;

    public GUI() {

        //Connect to databse
        database.connect();

        //Creates frame elements
        createFnameField();
        createLnameField();
        createAgeField();
        createTownField();
        createSubmitButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        //Initialises frame properties
        this.setTitle("Database Test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void createFnameField() {
        fNameLabel = new JLabel("First name: ");
        final int FIELD_WIDTH = 10;
        fNameField = new JTextField(FIELD_WIDTH);
    }

    public void createLnameField() {
        lNameLabel = new JLabel("Last name: ");
        final int FIELD_WIDTH = 10;
        lNameField = new JTextField(FIELD_WIDTH);
    }

    public void createAgeField() {
        ageLabel = new JLabel("Age: ");
        final int FIELD_WIDTH = 5;
        ageField = new JTextField(FIELD_WIDTH);
    }

    public void createTownField() {
        townLabel = new JLabel("Town: ");
        final int FIELD_WIDTH = 15;
        townField = new JTextField(FIELD_WIDTH);
    }

    private void createSubmitButton() {
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
    }

    public void createPanel() {

        JPanel panel = new JPanel();
        panel.add(fNameLabel);
        panel.add(fNameField);
        panel.add(lNameLabel);
        panel.add(lNameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(townLabel);
        panel.add(townField);
        panel.add(submitButton);

        this.add(panel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitButton) {
            this.fName = fNameField.getText();
            this.lName = lNameField.getText();
            this.age = Integer.parseInt(ageField.getText());
            this.town = townField.getText();

            database.newUser(fName, lName, age, town);
        }
    }
}
