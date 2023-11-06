// Convert a switch statement into a switch expression. 
class SwitchExpr {
    public static void main(String[] args) {
        int eventCode = 6010;

        // This is a switch expression. Notice how its value is assigned
        // to the priorityLevel variable. Also notice how the value of the
        // switch is supplied by the yield statement.
        int priorityLevel = switch (eventCode) {
            case 1000, 1205, 8900:
                yield 1;
            case 2000, 6010, 9128:
                yield 2;
            case 1002, 7023, 9300:
                yield 3;
            default: // normal priority
                yield 0;
        };

        System.out.println("Priority level for event code " + eventCode +
                " is " + priorityLevel);
    }
}