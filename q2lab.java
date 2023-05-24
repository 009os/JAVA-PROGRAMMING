package LAB.lab1.lab2;
import java.util.Scanner;

public class q2lab {

    public static void main(String [] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBER : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("THE ADDITION OF BOTH NUMBERS IS : "+ a+b);
        System.out.println("THE SUBSTRACTION OF BOTH NUMBERS IS : "+ (a-b));
        System.out.println("THE DIVISION OF BOTH NUMBERS IS : "+ a/b);
        System.out.println("THE MULTIPLICATION OF BOTH NUMBERS IS : "+ a*b);

        sc.close();
    } 
    
}
