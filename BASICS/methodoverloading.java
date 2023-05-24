public class methodoverloading {

    static void hi()
    {
        System.out.println("HELLO GUYS !");
    }

    static void hi(int x){
        System.out.println("HELLO GUYS ! "+ x);
    }

    static void hi(int x, int y){
        System.out.println("HELLO GUYS ! "+ x +"," +y);
    }

    public static void main(String[]args){
        hi();
        int x=9;
        int y=90;

        hi(x);
        hi(x,y);

    }
    
}
