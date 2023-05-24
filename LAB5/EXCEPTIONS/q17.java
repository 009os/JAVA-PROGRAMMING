//Write a program in Java to display the names and roll numbers of students and showing required exception where possible.
public class q17 {
    public static void main(String[] args) {
        String[] names = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        int[] rollNumbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Name: " + names[i] + ", Roll Number: " + rollNumbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
    }
}
