//Write a Java code that converts 
//float to Float converts Float to String converts String to float converts float to String converts String to Float converts Float to float.
public class q22 {
    public static void main(String[] args) {
        float numFloat = 123.45f;

        Float numFloatObj = Float.valueOf(numFloat);

        String numString = numFloatObj.toString();

        float numFloat2 = Float.parseFloat(numString);

        String numString2 = Float.toString(numFloat);

        Float numFloatObj2 = Float.valueOf(numString);

        float numFloat3 = numFloatObj2.floatValue();

        System.out.println("numFloat = " + numFloat);
        System.out.println("numFloatObj = " + numFloatObj);
        System.out.println("numString = " + numString);
        System.out.println("numFloat2 = " + numFloat2);
        System.out.println("numString2 = " + numString2);
        System.out.println("numFloatObj2 = " + numFloatObj2);
        System.out.println("numFloat3 = " + numFloat3);
    }
}
