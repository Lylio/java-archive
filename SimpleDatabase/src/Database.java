import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static Connection connection = null;

    //Method Connect to database
    public void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/quickdb", "postgres", "cxzcxz");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");

    }



    //Insert data into database
    public void newUser(String fName, String lName, int age, String town) {

     String newFName = fName;
     String newLName = lName;
     int newAge = age;
     String newTown = town;

        Statement stmt = null;
        String query = "INSERT INTO userdetails (fname, lname, age, town) VALUES (" + "'" + newFName + "'," + "'" + newLName + "'," + age + ", '" + town + "'" + ")";
        try {
            stmt = connection.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Thank you - new user added to database.", "Confirmation", JOptionPane.PLAIN_MESSAGE);
        }
        catch (SQLException e ) {
            e.printStackTrace();
            System.err.println("error executing query " + query);
            JOptionPane.showMessageDialog(null, "Insertion error - please try again", "Insertion error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
