package lab_2_13.test_enum_3;

/**
 * Created by olegpoberezhets on 3/25/17.
 */
public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    DayOfWeek nextDay() {
        int nextDayOfWeek = DayOfWeek.this.ordinal();
        ++nextDayOfWeek;
        if (nextDayOfWeek == DayOfWeek.values().length) {
            nextDayOfWeek = 0;
        }
        return DayOfWeek.values()[nextDayOfWeek];
    }
}
