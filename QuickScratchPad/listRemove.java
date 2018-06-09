import java.util.ArrayList;
import java.util.List;

public class listRemove {
    public static void main(String[] args) {

        List myList = new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        for(int i = 0; i < myList.size();i++) {
            System.out.println(myList.remove(i));
        }





    }
}
