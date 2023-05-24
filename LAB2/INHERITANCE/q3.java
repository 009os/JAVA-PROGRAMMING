class worker {
    String name;

    worker(String n) {
        name = n;
    }

    void show() {

        System.out.println("Employee name : " + name);
    }
}

class dailyworker extends worker {
    int rate;

    dailyworker(String n, int r) {
        super(n);
        rate = r;
    }

    void compay(int h) {
        show();
        System.out.println("Salary : " + rate * h);
    }
}

class salariedworker extends worker {
    int rate;

    salariedworker(String n, int r) {
        super(n);
        rate = r;
    }

    int hour = 40;

    void compay() {
        show();
        System.out.println("Salary : " + rate * hour);
    }
}

class q3 {
    public static void main(String args[]) {
        dailyworker d = new dailyworker("OMJI", 75);
        salariedworker s = new salariedworker("DEEPESH", 100);
        d.compay(45);
        s.compay();
    }
}