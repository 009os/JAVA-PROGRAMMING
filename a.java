package ASSGNMENT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class a {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<String>();

        AL.add("Hello");
        AL.add("Hi");
        AL.add("Okay");
        AL.add("Bye");

        System.out.println("Original List: " + AL);
 
        Iterator<String> it = AL.iterator();
        while(it.hasNext()) {
            String element = it.next();
            System.out.println("Element: " + element);
        }
        ArrayList<String> DAL = new ArrayList<String>(AL);
        Collections.reverse(AL);
        System.out.println("Reversed List: " + AL);
        System.out.println("Duplicate List: " + DAL);
    }

}
