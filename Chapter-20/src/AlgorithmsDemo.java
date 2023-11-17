// Demonstrate various algorithms.  

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class AlgorithmsDemo {
    public static void main(String[] args) {

        // Create and initialize linked list.
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // Create a reverse order comparator.
        Comparator<Integer> r = Collections.reverseOrder();

        // Sort list by using the comparator.
        Collections.sort(ll, r);

        System.out.print("List sorted in reverse: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();

        // Shuffle list.
        Collections.shuffle(ll);

        // Display randomized list.
        System.out.print("List shuffled: ");
        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Minimum: " + Collections.min(ll));
        System.out.println("Maximum: " + Collections.max(ll));
    }
}
