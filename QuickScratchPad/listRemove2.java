import java.util.ArrayList;

public class listRemove2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(2); //remember, removes index position, not value


        System.out.println(list); //1, 2, 4

    }
}
