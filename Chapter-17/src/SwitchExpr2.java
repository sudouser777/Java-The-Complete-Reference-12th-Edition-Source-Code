// Use the arrow "shorthand" to supply the priority level.
class SwitchExpr2 {
    public static void main(String[] args) {
        int eventCode = 6010;

        // In this switch expression, notice how the value is supplied
        // by use of an arrow case. Notice that no break statement is
        // required (or allowed) to prevent fall through.
        int priorityLevel = switch (eventCode) {
            case 1000, 1205, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
            default -> 0; // normal priority
        };

        System.out.println("Priority level for event code " + eventCode +
                " is " + priorityLevel);
    }
}