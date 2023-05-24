//Write a Java program to show that private member of a super class cannot be accessed from derived classes.
class ar {
    private int l, b;

    ar(int x, int y) {
        l = x;
        b = y;
    }

    int area() {
        return (l * b);
    }
}

class vol extends ar {
    int h;

    vol(int x, int y, int z) {
        super(x, y);
        h = z;
    }

    int volume() {
        return (area() * h);
    }
}

class q1 {
    public static void main(String args[]) {
        vol cr = new vol(10, 20, 15);
        int a1 = cr.area();
        int v1 = cr.volume();
        System.out.println("Area of Room : " + a1);
        System.out.println("Volume of Room : " + v1);
    }
}
