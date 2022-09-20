import java.util.LinkedList;
import java.util.Queue;

public class App 
{
    public static void main(String[] args) throws Exception 
    {

        Queue<String> INF214 = new LinkedList<>();

        //Adding elements to the queue
        INF214.add("Masangcay");
        INF214.add("Hernandez");
        INF214.add("Cinco");
        INF214.add("Jalalon");
        INF214.add("Sumugat");

        //Displays all the elements of the queue
        System.out.println("\nThese are all the elements of the queue: ");
        System.out.println(INF214);

        //Displays the size of the queue
        System.out.println("\nThe size of the queue is: ");
        System.out.println(INF214.size());

        //Shows the front of the queue
        System.out.println("\nThe front of the queue is: ");
        System.out.println(INF214.peek());

        //Dequeues 5 elements on the queue
        INF214.remove();
        INF214.remove();
        INF214.remove();
        INF214.remove();
        INF214.remove();

        //Enqueues another 5 elements to the queue
        INF214.add("Bolanos");
        INF214.add("Monte de Ramos");
        INF214.add("Abella");
        INF214.add("Bablis");
        INF214.add("Du");

        //Displays all the elements of the queue
        System.out.println("\nThese are now all the current elements of the queue after removing the first 5 elements: ");
        System.out.println(INF214);

        //Displays the size of the queue
         System.out.println("\nThe current size of the queue is: ");
        System.out.println(INF214.size());

        //Shows the front of the queue
        System.out.println("\nThe current front of the queue is: ");
        System.out.println(INF214.peek());

    }
}
