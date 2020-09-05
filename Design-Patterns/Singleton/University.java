public class University {

    private static University instance = new University();

    private University(){};

    public static University getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello");
    }
}
