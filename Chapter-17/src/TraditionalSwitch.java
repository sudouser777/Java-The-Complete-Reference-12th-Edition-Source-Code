// Use a traditional switch to set a priority level based on which
// event code is matched. 
class TraditionalSwitch {

    public static void main(String[] args) {
        int priorityLevel;

        int eventCode = 6010;

        // A traditional switch that supplies a value associated
        // with a case.
        switch (eventCode) {
            case 1000: // In this traditional switch, case stacking is used.
            case 1205:
            case 8900:
                priorityLevel = 1;
                break;
            case 2000:
            case 6010:
            case 9128:
                priorityLevel = 2;
                break;
            case 1002:
            case 7023:
            case 9300:
                priorityLevel = 3;
                break;
            default: // normal priority
                priorityLevel = 0;
        }

        System.out.println("Priority level for event code " + eventCode +
                " is " + priorityLevel);
    }
}