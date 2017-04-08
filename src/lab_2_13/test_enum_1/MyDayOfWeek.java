package lab_2_13.test_enum_1;

/**
 * Created by olegpoberezhets on 3/19/17.
 */
public enum MyDayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

   MyDayOfWeek nextDay() {
       int nextDayOfWeek = MyDayOfWeek.this.ordinal();
       ++nextDayOfWeek;
       if (nextDayOfWeek == MyDayOfWeek.values().length) {
           nextDayOfWeek = 0;
       }
       return MyDayOfWeek.values()[nextDayOfWeek];
    }
}
