
interface Test {
    void isSquare(int n);
}

class Arithmetic implements Test {
    public void isSquare(int n) {
        if (n < 0) {
            System.out.println(n + " is not a square number");
        }
        else{
            System.out.println((n*n) + " is your required square");
            
        }
    }
}


class q1 {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        int n = 25;
        a.isSquare(n);
    }
}



 