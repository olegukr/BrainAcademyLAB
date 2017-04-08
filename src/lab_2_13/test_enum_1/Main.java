package lab_2_13.test_enum_1;

import java.util.Scanner;

import static lab_2_13.test_enum_1.MyDayOfWeek.*;

/**
 * Create new project called TestEnum1. Add package “com.brainacad.oop.testenum1”.
 * 1) Create a class Main with a main().
 * 2) Create a enum type MyDayOfWeek which specify a days-of-the-week (SUNDAY,
 * MONDAY, ...).
 * 3) Add to method main() code that iterate over MyDayOfWeek enum possible values in
 * loop and print each value name to console.
 * 4) Execute the program.
 * Example of program output:
 * SUNDAY
 * MONDAY
 * TUESDAY
 * WEDNESDAY
 * THURSDAY
 * FRIDAY
 * SATURDAY
 * <p>
 * 2_13_2
 * Open project called TestEnum1 (form 2-13-1 lab).
 * Add to method main() code that iterate over
 * MyDayOfWeek enum possible values in loop and using switch statement
 * print to console days of the week only when you have classes in Java Programming.
 * Examp
 * My Java day: TUESDAY
 * My Java day: THURSDAY
 * My Java day: SATURDAY
 * Execute the program.
 * <p>
 * 2_13_3
 * Open project called TestEnum1 (form 2-13-2 lab).
 * Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of week
 * on for given enum value.
 * For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY.
 * Add to method main() code that read string value from console (using System.in and Scanner),
 * then you must parse string value to particular enum value (using valueOf() method)
 * and then print the name of next day of week to console.
 * FRIDAY
 * The next day of week: SATURDAY
 * Created by olegpoberezhets on 3/19/17.
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            System.out.println(myDayOfWeek);
        }
        String myJavaDay = "My Java day: ";
        for (MyDayOfWeek myDayOfWeek : MyDayOfWeek.values()) {
            switch (myDayOfWeek) {

                case MONDAY:
                    break;
                case WEDNESDAY:
                    break;
                case TUESDAY:
                    break;
                case THURSDAY:
                    break;
                case FRIDAY:
                    break;
                case SATURDAY: {
                    System.out.println(myJavaDay + myDayOfWeek);
                    break;
                }
                case SUNDAY: {
                    System.out.println(myJavaDay + myDayOfWeek);
                    break;
                }
            }
        }

        Scanner scanner = new Scanner(System.in);
        String dayIn = scanner.next();
        MyDayOfWeek day = MyDayOfWeek.valueOf(dayIn);
        System.out.println("The next day of week: " + day.nextDay());
    }
}

/* output:
    MONDAY
    TUESDAY
    WEDNESDAY
    THURSDAY
    FRIDAY
    SATURDAY
    SUNDAY
        My Java day:SATURDAY
        My Java day:SUNDAY
    SUNDAY
    The next day of week:MONDAY
*/