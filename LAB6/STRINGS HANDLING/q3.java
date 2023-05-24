//Write a program in Java to read a statement from console, convert it into upper case and again print on console.
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
