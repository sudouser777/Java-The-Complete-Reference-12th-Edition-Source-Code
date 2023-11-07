// Use a compact record constructor.

// Declare an employee record.
record Employee(String name, int idNum) {

    // Use a compact canonical constructor to remove any leading and
    // trailing spaces from the name string.
    public Employee {
        // Remove any leading and trailing spaces.
        name = name.trim();
    }
}

class RecordDemo2 {
    public static void main(String[] args) {
        Employee[] empList = new Employee[4];

        // Here, the name has no leading or trailing spaces.
        empList[0] = new Employee("Doe, John", 1047);

        // The next three names have leading and/or trailing spaces.
        empList[1] = new Employee("  Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel  ", 1049);
        empList[3] = new Employee("  Martin, Dave  ", 1050);

        // Use the record accessors to display names and IDs.
        // Notice that all leading and/or trailing spaces have been
        // removed from the name component by the constructor.
        for (Employee e : empList)
            System.out.println("The employee ID for " + e.name() + " is " + e.idNum());
    }
}