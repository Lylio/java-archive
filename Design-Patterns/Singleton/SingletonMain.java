public class SingletonMain {
    public static void main(String[] args) {

        University university = University.getInstance();

        university.showMessage();
    }
}
