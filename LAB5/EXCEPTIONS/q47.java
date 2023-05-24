package LAB.lab7;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class q47 {
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);
            int a =sc.nextInt();
            int b =sc.nextInt();
            if (a < 0 || b < 0) {
                throw new Exception("Non-bit signed integers not allowed.");
            }
            if (b == 0) {
                throw new ArithmeticException("Division by zero.");
            }
            int result = a / b;
            System.out.println("Result: " + result);
       } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
