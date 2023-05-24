import java.util.Scanner;

public class search {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int size=sc.nextInt();
        int[] marks= new int[size];
        System.out.println("ENTER YOUR ARRAY ELEMENTS : ");
        for(int i=0;i<size;i++)
        {
            marks[i]=sc.nextInt();
        }

        System.out.println("ENTER AN ELEMENT TO SEARCH : ");
        int a = sc.nextInt();

        boolean b=false;

        for(int element:marks){
            if(element==a)
            {
                b=true;
            }

        }

        if(b==true)
        {System.out.println("ELEMENT FOUND ");}
        else
        {System.out.println("ELEMENT NOT FOUND");}
        sc.close();
    }

}
