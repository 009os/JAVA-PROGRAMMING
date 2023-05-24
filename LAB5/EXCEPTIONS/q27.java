//Create an exception class, which throws an exception if operand is nonnumeric in calculating modules. (Use command line arguments)
import java.util.Scanner;
class NonNum extends Exception {
    NonNum() {
        super("the value is non numeric \n");
    }
}

class q27 {
    public static void main(String ar[]) {
        try {
            Scanner sc= new Scanner(System.in);
            int a =sc.nextInt();
            throw new NonNum();
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (NonNum e) {
            System.out.println(e);
        }
    }
}
