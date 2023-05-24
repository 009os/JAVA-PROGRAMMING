
import java.util.Scanner;

public class arrayrev {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        System.out.println("ENTER YOUR ARRAY ELEMENTS : ");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        int l = marks.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i = 0; i < n; i++) {
            temp = marks[i];
            marks[i] = marks[l - i - 1];
            marks[l - i - 1] = temp;
        }
        for (int element : marks) {
            System.out.print(element + " ");
        }

        sc.close();
    }

}
