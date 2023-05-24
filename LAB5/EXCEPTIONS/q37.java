package LAB.lab7;
import java.util.Scanner;

class NumberTooSmallException extends Exception {
    public NumberTooSmallException(String message) {
        super(message);
    }
}

public class q37 {
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);
            int num =sc.nextInt();
            if (num < 500) {
                throw new NumberTooSmallException("Number is too small!");
            }
            System.out.println("Number is: " + num);
        
        } catch (NumberTooSmallException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
