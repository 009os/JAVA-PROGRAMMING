//You are given two integers, a and b as input, you have to compute a/b: If a and b are not bit signed integers or if is zero, exception will occur and you have to report it. 
//Read sample Input/Output to know what to report in case of exceptions.
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
