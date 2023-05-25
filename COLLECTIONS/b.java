//Write a program for the following HashMap
//• find whether specified key exists or not.
//• find whether specified value exists or not.
//• get all keys from the given HashMap.
//• get all key-value pair as Entry objects.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class b {
     public static void main(String[] args) {

        Map<String, Integer> myHashMap = new HashMap<String, Integer>();

        myHashMap.put("OMJI", 37);
        myHashMap.put("ANJALI", 56);
        myHashMap.put("DEEPESH", 58);
        myHashMap.put("RAHUL", 52);

        String key = "OMJI";
        if(myHashMap.containsKey(key)) {
            System.out.println("The key " + key + " exists in the HashMap");
        } else {
            System.out.println("The key " + key + " does not exist in the HashMap");
        }

        int value = 37;
        if(myHashMap.containsValue(value)) {
            System.out.println("The value " + value + " exists in the HashMap");
        } else {
            System.out.println("The value " + value + " does not exist in the HashMap");
        }

        Set<String> keys = myHashMap.keySet();
        System.out.println("All keys in the HashMap: " + keys);

        Set<Map.Entry<String, Integer>> entries = myHashMap.entrySet();
        System.out.println("All key-value pairs in the HashMap: " + entries);
    }

}
