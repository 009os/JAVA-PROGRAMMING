import java.util.Scanner;
public class userinput {
    public static void main(String[] args)
    {   
        
        Scanner sc =new Scanner(System.in);
        //INTEGER TYPE
        // System.out.println("PLEASE ENTER TWO INTEGER NUMBERS");
        // System.out.println("ENTER NUMBER 1 : ");
        // int a = sc.nextInt();
        // System.out.println("ENTER NUMBER 2 : ");
        // int b = sc.nextInt();
        // int sum=a+b;
        // System.out.println("THE SUM IS :");
        // System.out.println(sum);

        //FLOATING TYPE
        // System.out.println("PLEASE ENTER TWO FLOATING TYPE NUMBERS");
        // System.out.println("ENTER NUMBER 1 : ");
        // float a1 = sc.nextFloat();
        // System.out.println("ENTER NUMBER 2 : ");
        // float b1 = sc.nextFloat();
        // float sum1=a1+b1;
        // System.out.println("THE SUM IS :");
        // System.out.println(sum1);
        

        // //CHECK CORRECT DATA-TYPE
        // System.out.println("CHECKING THE USER INPUT BELONGS TO CORRECT DATA-TYPE OR NOT : ");
        // boolean b2=sc.hasNextInt();
        // System.out.println(b2);

        //STRING TYPE
        String str=sc.nextLine();
        System.out.println(str);

        sc.close();


    }
}
