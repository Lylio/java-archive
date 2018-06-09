import java.util.Scanner;

public class Quicker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int doubled = 0;
        String reply;

        System.out.println("Please enter number: ");
        num1 = scanner.nextInt();
        doubled = num1 * 2;
        System.out.println("Would you like a printout? Y/N: ");
        reply = scanner.next();
        if(reply.equalsIgnoreCase("Y")) {
            Printer printer = new Printer(doubled);
            printer.print();
            System.out.println("Your file has been printed");
        } else {
            System.out.println("Thank you. Goodbye.");
        }
    }
}
