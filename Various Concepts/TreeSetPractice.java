import java.util.TreeSet;

public class TreeSetPractice {

    public static void main(String[] args) {

        TreeSet employeesSet = new TreeSet();
        employeesSet.add("Harry Smith");
        employeesSet.add("Sarah White");
        employeesSet.add("Alfred Bingo");
        employeesSet.add("Duke Acker");
        employeesSet.add("Alison Bigbum");
        //Duplicates ignored in TreeSets
        employeesSet.add("Sarah White");

        System.out.println(employeesSet.contains("Duke Acker"));
        System.out.println(employeesSet.contains("Dave Harving"));
        System.out.println(employeesSet.contains("Harry smith"));

        System.out.println(employeesSet);


    }
}
