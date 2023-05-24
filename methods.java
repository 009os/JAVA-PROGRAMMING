public class methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        methods obj = new methods();
        c = obj.logic(a, b);
        //c = logic(a, b);
        System.out.println(c);
      
    }
}

