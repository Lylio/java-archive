import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {

        Queue queue = new LinkedList();
        queue.add("Monday");
        queue.add("Tuesday");
        queue.add("Wednesday");
        queue.add("Thursday");

        System.out.println(queue);

        Object test1 = queue.element(); //Gets first element (throws exception if empty)
        Object test2 = queue.peek(); //Gets first element (returns null if empty)

        System.out.println(test1 + ", " + test2);

        Object test3 = queue.poll(); //Gets and removes first element (returns null
                                    // if empty

        Object test4 = queue.remove(); //Gets and removes first element (throws exception
                                         // if empty

        System.out.println(test3 + ", " + test4);
        System.out.println(queue);

        queue.add("Friday");
        System.out.println(queue);


    }
}
