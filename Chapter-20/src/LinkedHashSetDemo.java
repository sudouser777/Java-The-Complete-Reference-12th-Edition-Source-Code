// Demonstrate HashSet. 

import java.util.LinkedHashSet;

class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a hash set.
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        // Add elements to the hash set.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);
    }
}