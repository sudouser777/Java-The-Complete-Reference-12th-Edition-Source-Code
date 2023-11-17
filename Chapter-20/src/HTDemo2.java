// Use iterators with a Hashtable. 

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance =
                new Hashtable<String, Double>();

        String str;
        double bal;

        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);

        // Show all balances in hashtable.
        // First, get a set view of the keys.
        Set<String> set = balance.keySet();

        // Get an iterator.
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
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