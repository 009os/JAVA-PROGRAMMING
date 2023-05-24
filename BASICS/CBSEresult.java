import java.util.Scanner;

public class CBSEresult {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER MARKS OF STUDENT IN ALL 5 SUBJECTS (OUT OF 100) : ");
        System.out.println("MARKS IN SUBJECT 1 : ");
        int a=sc.nextInt();
        System.out.println("MARKS IN SUBJECT 2 : ");
        int b=sc.nextInt();
        System.out.println("MARKS IN SUBJECT 3 : ");
        int c=sc.nextInt();
        System.out.println("MARKS IN SUBJECT 4 : ");
        int d=sc.nextInt();
        System.out.println("MARKS IN SUBJECT 5 : ");
        int e=sc.nextInt();

        float percentage=(a+b+c+d+e)/5;
        System.out.println("THE PERCENTAGE IS : ");
        System.out.println(percentage);
        sc.close();
        
    }
    
}






























