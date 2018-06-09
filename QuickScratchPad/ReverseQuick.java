import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseQuick {

    public static void main(String[] args) {

        Scanner scanner = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            scanner = new Scanner(new FileReader("answer.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<String> myList = new ArrayList<>();

        while(scanner.hasNext()) {
            myList.add(scanner.next());
        }

        for(int i = myList.size() - 1; i > 0; i--) {
            stringBuilder.append(myList.get(i) + " ");
        }

        System.out.println(stringBuilder);
    }
}
