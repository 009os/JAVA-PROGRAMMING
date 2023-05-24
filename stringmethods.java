public class stringmethods {

    public static void main(String[] args)
    {
        String a ="     OMJI SHUKla";
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());
        System.out.println(a.substring( 3));
        System.out.println(a.substring(3,7));
        System.out.println(a.replace('O','a'));
        System.out.println(a.startsWith("o"));
        System.out.println(a.endsWith(a));
        System.out.println(a.charAt(3));
        System.out.println(a.indexOf(a));
        System.out.println(a.indexOf("s",3));
        System.out.println(a.lastIndexOf("O",5));
    }
}



