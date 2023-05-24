package LAB.lab8;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();

        String output = input.toUpperCase();

        System.out.println("New statement: " + output);
        scanner.close();
    }
}
