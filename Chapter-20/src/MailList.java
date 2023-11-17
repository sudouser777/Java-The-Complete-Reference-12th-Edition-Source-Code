// A simple mailing list example.

import java.util.LinkedList;

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c,
            String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + state + " " + code;
    }
}


class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<Address>();

        // Add elements to the linked list.
        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahome", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));

        // Display the mailing list.
        for (Address element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }
}