package LAB.lab8;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get name from user and create a String object
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Find the length of the name
        int length = name.length();
        System.out.println("Length of name: " + length);

        // Check if the character 'a' is in the name and count occurrences
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (name.charAt(i) == 'a') {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("The character 'a' is not present in the name.");
        } else {
            System.out.println("The character 'a' is present in the name " + count + " times.");

            System.out.print("Locations of 'a': ");
            for (int i = 0; i < length; i++) {
                if (name.charAt(i) == 'a') {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
