//This program will print the result of students according to their marks.
import java.util.Scanner;
public class Main {

        public static void main(String[] args)
        {
    
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        int temp;
        
        System.out.println("PLEASE ENTER MARKS OF STUDENT : ");

        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i <10; i++) {     
            for (int j = i+1; j < 10; j++) {     
               if(marks[i] > marks[j]) {    
                   temp = marks[i];    
                   marks[i] = marks[j];    
                   marks[j] = temp;    
               }     
            }     
        }
        
        System.out.println("THE FINAL RESULT IS : ");

        for(int j=0;j<10;j++)
        {
            if(marks[j]<40)
            {
                System.out.println(marks[j] + " FAIL");
            }

            else if(marks[j]>=40 && marks[j]<50)
            {
                System.out.println(marks[j] + " PASS");
            }

            else if(marks[j]>=50 && marks[j]<75)
            {
                System.out.println(marks[j]+" Merit");
            }

            else if(marks[j]>=75)
            {
                System.out.println(marks[j]+ " DISTINCTION");
            }
        }

    

        sc.close();
    
        }
    }
    



