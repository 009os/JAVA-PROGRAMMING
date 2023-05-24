public class varargs {
    static int add(int x,int ...arr){
        int res=0;
        for(int a : arr){
            res = res+a;
        }
        return res;
    }

    static int add1(int ...arr){
        int res=0;
        for(int a : arr){
            res = res+a;
        }
        return res;
    }

    public static void main(String [] args)
    {
        System.out.println(add(2,3,4));
        System.out.println(add1(3,5));

    }
}
