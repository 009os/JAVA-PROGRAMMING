interface Calculator {
    void division(int x, int y);
    void modulus(int x, int y);
}

class BasicCalculator implements Calculator {
  
    public void division(int x, int y) {
        if (y == 0) {
            System.out.println("Error: Divide by zero");
        } else {
            System.out.println("Result of division: " + (x / y));
        }
    }

  
    public void modulus(int x, int y) {
        System.out.println("Result of modulus: " + (x % y));
    }
}

public class q4 {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        calculator.division(10, 2);   // Result of division: 5
        calculator.division(10, 0);   // Error: Divide by zero
        calculator.modulus(10, 3);    // Result of modulus: 1
    }
}
