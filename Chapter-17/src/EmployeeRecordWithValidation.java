record Employee4(String name, int idNum) {

    public Employee4 {
        // Remove any leading and trailing spaces.
        name = name.trim();

        // Perform a minimalist check that name follows the
        // lastname, firstname format.
        //
        // First, confirm that name contains only one comma.
        int i = name.indexOf(','); // look for comma separating names.
        int j = name.lastIndexOf(',');
        if (i != j) throw
                new IllegalArgumentException("Multiple commas found.");

        // Next, confirm that a comma is present after
        // at least one leading character, and that at least one
        // character follows the comma.
        if (i < 1 | name.length() == i + 1) throw
                new IllegalArgumentException("Required format: last, first");
    }
}

class Demo {
    public static void main(String[] args) {
        Employee4[] empList = new Employee4[4];
        empList[0] = new Employee4("Doe, John", 1047);

        // No comma between last and first name.
        empList[1] = new Employee4("Jones Robert", 1048); // throws exception

        // Extra commas.
        empList[2] = new Employee4("Jones, ,Robert", 1048); // throws exception

        // Missing last name.
        empList[3] = new Employee4(", Robert", 1048); // throws exception

    }
}