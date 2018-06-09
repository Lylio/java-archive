import java.io.FileWriter;

public class Printer {

    int a;

    public Printer(int a) {
        this.a = a;
    }

    public void print() {
        //System.out.println("Mock print - " + a);
        try {
            FileWriter writer = new FileWriter("answer.txt");
            writer.write("Your number doubled is " + a);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
