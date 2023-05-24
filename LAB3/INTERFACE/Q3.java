interface Constants {
    int MAX_VALUE = 100;
    int MIN_VALUE = 0;
}

class NumberChecker implements Constants {
    public boolean isWithinRange(int num) {
        return num >= MIN_VALUE && num <= MAX_VALUE;
    }
}

public class Q3 {
    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();
        System.out.println(checker.isWithinRange(50));  // true
        System.out.println(checker.isWithinRange(150)); // false
    }
}
