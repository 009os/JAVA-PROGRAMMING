package LAB.lab8;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character or substring to search for: ");
        String search = scanner.nextLine();

        int firstIndex = input.indexOf(search);
        if (firstIndex == -1) {
            System.out.println("Character or substring not found.");
        } else {
            System.out.println("First occurrence of " + search + " found at index " + firstIndex);
        }

        int lastIndex = input.lastIndexOf(search);
        if (lastIndex == -1) {
            System.out.println("Character or substring not found.");
        } else {
            System.out.println("Last occurrence of " + search + " found at index " + lastIndex);
        }

        scanner.close();
    }
}
