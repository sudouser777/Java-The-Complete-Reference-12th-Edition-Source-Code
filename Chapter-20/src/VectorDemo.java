// Demonstrate various Vector operations. 

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {

        // initial size is 3, increment is 2
        Vector<Integer> v = new Vector<Integer>(3, 2);

        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " +
                v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Capacity after four additions: " +
                v.capacity());
        v.addElement(5);
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(6);
        v.addElement(7);

        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(9);
        v.addElement(10);

        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(11);
        v.addElement(12);


        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        if (v.contains(3))
            System.out.println("Vector contains 3.");

        // Enumerate the elements in the vector.
        Enumeration<Integer> vEnum = v.elements();

        System.out.println("\nElements in vector:");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();

        // Use an iterator to display contents.
        Iterator<Integer> vItr = v.iterator();

        System.out.println("\nElements in vector:");
        while (vItr.hasNext())
            System.out.print(vItr.next() + " ");
        System.out.println();

        // Use an enhanced for loop to display contents.
        System.out.println("\nElements in vector:");
        for (int i : v)
            System.out.print(i + " ");

        System.out.println();
    }
}