import java.util.EnumSet;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);
        // All days: [SUNDAY, MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATURDAY]
        EnumSet<Day> workDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WENDSDAY, Day.THURSDAY, Day.FRIDAY);
        System.out.println("Work days: " + workDays);
        // Work days: [MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY]
        System.out.println("WorkDays contains Monday is " + workDays.contains(Day.MONDAY));
        // WorkDays contains Monday is true
    }
}
