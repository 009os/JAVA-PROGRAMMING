package LAB.lab7;
import java.util.Scanner;


import java.lang.Math;
import java.lang.ArithmeticException;
public class q57 {
    public static void main(String[] args) {
        try {
            Scanner sc= new Scanner(System.in);
            int a =sc.nextInt();
            int b =sc.nextInt();
            if (a < 0 || b < 0) {
                throw new Exception("NUMBERS SHOULD NOT BE NEGATIVE");
            }
            if (b == 0 || a==0) {
                throw new ArithmeticException("NUMBERS SHOULD NOT BE ZERO");
            }
            long result =  (long)Math.pow(a, b);
            System.out.println("Result: " + result);
       } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
}
