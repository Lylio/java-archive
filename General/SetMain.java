import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {

        Set<String> mySet = new TreeSet<>();

        mySet.add("Monday");
        mySet.add("Tuesday");
        mySet.add("Wednesday");
        mySet.add("Thursday");
        mySet.add("Friday");

        System.out.println(mySet);

    }
}
