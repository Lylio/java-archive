import java.util.InputMismatchException;
import java.util.Scanner;

public class AddFloats {

    public static void main(String[] args) {

        int tries = 2;
        double total = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floats (-1 to quit): ");
        while(tries >= 0) {
            try {
                double currentNum = scanner.nextDouble();
                if(currentNum == -1) {
                    break;
                } else {
                    total += currentNum;
                }
            } catch(InputMismatchException e) {
                tries--;
                System.out.println("Error - please enter a float: ");
                scanner.next();
            }
        }

        System.out.println("Total is: " + total);
    }
}
