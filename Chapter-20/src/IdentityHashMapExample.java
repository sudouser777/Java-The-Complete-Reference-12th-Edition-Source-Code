import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // Creating an IdentityHashMap
        Map<String, String> identityHashMap = new IdentityHashMap<>();

        // Creating two strings with the same content
        String str1 = new String("Java");
        String str2 = new String("Java");

        // Adding entries to the IdentityHashMap
        identityHashMap.put(str1, "Value1");
        identityHashMap.put(str2, "Value2");

        // Checking the size of the IdentityHashMap
        System.out.println("Size of IdentityHashMap: " + identityHashMap.size()); // Outputs: 2

        // Using reference equality for keys
        System.out.println("Are keys equal? " + (str1 == str2)); // Outputs: false

        // Using the IdentityHashMap to check for existence
        System.out.println("Contains key (str1)? " + identityHashMap.containsKey(str1)); // Outputs: true
        System.out.println("Contains key (str2)? " + identityHashMap.containsKey(str2)); // Outputs: true

        // Iterating over entries in the IdentityHashMap
        System.out.println("Entries in IdentityHashMap:");
        for (Map.Entry<String, String> entry : identityHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
