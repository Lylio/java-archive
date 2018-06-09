import java.util.HashSet;
import java.util.Set;

public class ATest {
    public static void main(String[] args) {

        Set<A> set = new HashSet<A>();
        //Remember, each new A is a unique object, these aren't duplicates
        set.add(new A());
        set.add(new A());
        set.add(new A());
        set.add(new A());

        System.out.println(set);
        System.out.println(set.size());

        Set<Integer> set2 = new HashSet<>();
        //This contains duplicate values and so are not added to the set
        set2.add(2);
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(6);

        System.out.println(set2);
        System.out.println(set2.size());

    }
}
