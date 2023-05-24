package LAB.lab1.lab2;

import java.util.Scanner;

public class q1lab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("The largest of three numbers is :  " + a);
            }

            else {
                System.out.println("The largest of three numbers is :  " + c);
            }

        } else {
            if (b > c) {
                System.out.println("The largest of three numbers is :  " + b);
            } else {
                System.out.println("The largest of three numbers is :  " + c);
            }

        }
        sc.close();
    }

}
