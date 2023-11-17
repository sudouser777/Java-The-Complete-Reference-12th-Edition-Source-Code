// Use a default property list.  

import java.util.Properties;
import java.util.Set;

class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.setProperty("Florida", "Tallahassee");
        defList.setProperty("Wisconsin", "Madison");

        Properties capitals = new Properties(defList);

        capitals.setProperty("Illinois", "Springfield");
        capitals.setProperty("Missouri", "Jefferson City");
        capitals.setProperty("Washington", "Olympia");
        capitals.setProperty("California", "Sacramento");
        capitals.setProperty("Indiana", "Indianapolis");

        // Get a set-view of the keys.
        Set<?> states = capitals.keySet();

        // Show all of the states and capitals.
        for (Object name : states)
            System.out.println("The capital of " +
                    name + " is " +
                    capitals.getProperty((String) name)
                    + ".");

        System.out.println();

        // Florida will now be found in the default list.
        String str = capitals.getProperty("Florida");
        System.out.println("The capital of Florida is "
                + str + ".");
    }
}