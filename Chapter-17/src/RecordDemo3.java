// Use a non-canonical constructor in a record.

// Declare an employee record that explicitly declares both
// a canonical and non-canonical constructor.
record Employee3(String name, int idNum) {

    // Use a static field in a record.
    static int pendingID = -1;

    // Use a compact canonical constructor to remove any leading and
    // trailing spaces from the name string.
    public Employee3 {
        // Remove any leading and trailing spaces.
        name = name.trim();
    }

    // This is a non-canonical constructor. Notice that it is
    // not passed an ID number. Instead, it passes pendingID to the
    // canonical constructor to create the record.
    public Employee3(String name) {
        this(name, pendingID);
    }
}

class RecordDemo3 {
    public static void main(String[] args) {
        Employee3[] empList = new Employee3[4];

        // Create a list of employees that uses the Employee3 record.
        empList[0] = new Employee3("Doe, John", 1047);
        empList[1] = new Employee3("Jones, Robert", 1048);
        empList[2] = new Employee3("Smith, Rachel", 1049);

        // Here, the ID number is pending.
        empList[3] = new Employee3("Martin, Dave");

        // Display names and IDs.
        for (Employee3 e : empList) {
            System.out.print("The employee ID for " + e.name() + " is ");
            if (e.idNum() == Employee3.pendingID) System.out.println("Pending");
            else System.out.println(e.idNum());
        }
    }
}
