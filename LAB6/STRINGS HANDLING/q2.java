//Write a program that converts all characters of a string in capital letters. (Use String Buffer to store a string).
public class q2 {  
    public static void main(String[] args) {  
          
        String str1="omji";  
        StringBuffer newStr=new StringBuffer(str1);  
          
        for(int i = 0; i < str1.length(); i++) {  
              
            //Checks for lower case character  
            if(Character.isLowerCase(str1.charAt(i))) {  
                
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));  
            }  
            //Checks for upper case character  
            else {  
                continue; 
            }  
        }  
        System.out.println("String after case conversion : " + newStr);  
    }  
}  
