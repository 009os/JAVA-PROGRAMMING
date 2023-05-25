package ASSGNMENT;
import java.util.HashSet;
import java.util.ArrayList;

public class c {
    public static void main(String[] args) {

        HashSet<String> HS = new HashSet<String>();

        HS.add("apple");
        HS.add("banana");
        HS.add("cherry");

        ArrayList<String> AL = new ArrayList<String>();

        AL.add("cherry");
        AL.add("date");
        AL.add("elderberry");

        HS.addAll(AL);

        System.out.println("HashSet after copying from ArrayList: " + HS);

        HS.clear();

        System.out.println("HashSet after clearing all entries: " + HS);

        HashSet<User> userHS = new HashSet<User>();

        userHS.add(new User("John", "Doe", 30));
        userHS.add(new User("Jane", "Smith", 25));
        userHS.add(new User("Bob", "Jones", 40));

        User userToFind = new User("John", "Doe", 30);

        if (userHS.contains(userToFind)) {
            System.out.println("User " + userToFind + " found in the HashSet");
        } else {
            System.out.println("User " + userToFind + " not found in the HashSet");
        }
    }
}

class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}