class privateMODIFIE {

    private int id;
    private String name;

    void setname(String name) {
        this.name = name;
    }

    void setid(int id) {
        this.id = id;
    }

    String getname() {
        return name;
    }

    int getid() {
        return id;
    }

}
public class privateMODIFIER {

    public static void main(String[] args) {
        privateMODIFIE p1 = new privateMODIFIE();

       // p1.id=2; will throw error bcz u r trying to change the private keyword 
        p1.setname("omji");
        p1.setid(1);

        System.out.println(p1.getname());
        System.out.println(p1.getid());
    }

}
