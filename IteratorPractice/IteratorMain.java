import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {

        ArrayList names = new ArrayList();
        names.add("Sam");
        names.add("Alfie");
        names.add("Lucy");

        Iterator it = names.iterator();
        while (it.hasNext()) {
            String name = (String)it.next();
            if(name != "Alfie") {
                System.out.println(name);
            }

        }

    }
}
