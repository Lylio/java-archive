import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {

    private final static Logger LOGGER = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {

        LOGGER.setLevel(Level.INFO);
        quickMethod();
    }

    public static int quickMethod() {
        int a = 5;
        int b= 6;
        int total = a + b;
        System.out.println(total);
        LOGGER.info("Hello, I'm a logger");
        return total;
    }
}

