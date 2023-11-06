// Use a compact record constructor.

// Declare an employee record.
record Employee2(String name, int idNum) {

    // Use a compact canonical constructor to remove any leading and
    // trailing spaces from the name string.
    public Employee2 {
        // Remove any leading and trailing spaces.
        name = name.trim();
    }
}

class RecordDemo2 {
    public static void main(String[] args) {
        Employee2[] empList = new Employee2[4];

        // Here, the name has no leading or trailing spaces.
        empList[0] = new Employee2("Doe, John", 1047);

        // The next three names have leading and/or trailing spaces.
        empList[1] = new Employee2("  Jones, Robert", 1048);
        empList[2] = new Employee2("Smith, Rachel  ", 1049);
        empList[3] = new Employee2("  Martin, Dave  ", 1050);

        // Use the record accessors to display names and IDs.
        // Notice that all leading and/or trailing spaces have been
        // removed from the name component by the constructor.
        for (Employee2 e : empList)
            System.out.println("The employee ID for " + e.name() + " is " + e.idNum());
    }
}