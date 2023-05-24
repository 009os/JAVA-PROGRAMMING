
interface A {
    void method1();
    void method2();
}

class MyClass implements A {
    public void method1() {
        System.out.println("This is implementation of meth1 method in MyClass");
    }
    public void method2() {
        System.out.println("This is implementation of meth2 method in MyClass");
    }
}

class q2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
    }
}
