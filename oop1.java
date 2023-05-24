class oop1{

int id;
int sal;
String name;

public void print()
{
    System.out.println("THE ID IS : " + id);
    System.out.println("THE SNAME IS :"+ name);
}

public int show(){
    return sal;
}

public static void main(String[] args)
{
    oop1 one = new oop1();
    oop1 two = new oop1();

    one.id=1;
    one.sal=12000;
    one.name="OMJI";

    two.id=2;
    two.sal=14000;
    two.name="SHUKLA";

    one.print();
    two.print();

    int salary1 = one.show();
    int salary2 = two.show();

    System.out.println(salary1);
    System.out.println(salary2);

}

}