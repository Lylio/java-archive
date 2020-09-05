public class AbstractionOccurenceMain {
    public static void main(String[] args) {

        Title prideAndPrejudice = new Title("Pride and Prejudice", "Jane Austen", "GB7536564", "1886");

        LibraryItem priAndPrej1 = new LibraryItem("007867754", prideAndPrejudice);
        LibraryItem priAndPrej2 = new LibraryItem("0143243543", prideAndPrejudice);
        LibraryItem priAndPrej3 = new LibraryItem("9443242", prideAndPrejudice);

        System.out.println(priAndPrej1.getBarcode());

        System.out.println("priAndPrej1 title: " + priAndPrej1.getTitle().getName());
        System.out.println("priAndPrej2 title: " + priAndPrej2.getTitle().getName());


    }
}
