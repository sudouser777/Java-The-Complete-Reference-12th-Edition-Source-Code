// Demonstrate a Hashtable. 

import java.util.Enumeration;
import java.util.Hashtable;

class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance =
                new Hashtable<String, Double>();

        Enumeration<String> names;
        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);

        // Show all balances in hashtable.
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " +
                    balance.get(str));
        }

        System.out.println();

        // Deposit 1,000 into John Doe's account.
        bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000);
        System.out.println("John Doe's new balance: " +
                balance.get("John Doe"));
    }
}