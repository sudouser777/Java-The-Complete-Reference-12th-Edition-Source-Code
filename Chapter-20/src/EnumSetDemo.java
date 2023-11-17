import java.util.EnumSet;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetDemo {

    public static void main(String[] args) {

        // Creating an EnumSet with some initial elements
        EnumSet<Day> weekdays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);

        // Checking if an element is present
        System.out.println(weekdays.contains(Day.SUNDAY));

        System.out.println(weekdays);

        System.out.println(EnumSet.allOf(Day.class));

        System.out.println(EnumSet.range(Day.WEDNESDAY, Day.FRIDAY));
    }
}
