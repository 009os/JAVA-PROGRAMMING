//Write a Java code that converts int to Integer, 
//converts Integer to String, converts String to int, converts int to String, converts String to Integer converts Integer to int.
public class q11 {
    public static void main(String[] args) {
        int numInt = 123;

       
        Integer numInteger = Integer.valueOf(numInt);

     
        String numString = numInteger.toString();

    
        int numInt2 = Integer.parseInt(numString);

        String numString2 = Integer.toString(numInt);

        Integer numInteger2 = Integer.valueOf(numString);

        int numInt3 = numInteger2.intValue();

        // Print the results
        System.out.println("numInt = " + numInt);
        System.out.println("numInteger = " + numInteger);
        System.out.println("numString = " + numString);
        System.out.println("numInt2 = " + numInt2);
        System.out.println("numString2 = " + numString2);
        System.out.println("numInteger2 = " + numInteger2);
        System.out.println("numInt3 = " + numInt3);
    }
}
