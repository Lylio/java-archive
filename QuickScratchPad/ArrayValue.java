import java.util.ArrayList;

public class ArrayValue {

    public static void main(String[] args) {

        //What are the empty initial values of an int array?

        int[] myArray = new int[10];
        for(int i : myArray) {
            System.out.println(i);
        }

        ArrayList x = new ArrayList<>(10);
        System.out.println(x.size());

    }
}
