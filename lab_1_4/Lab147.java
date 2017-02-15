/**
 * Write a console program that prints result
 * of Ternary operator for integer variable initialization.
 * * Student should declare and initialize integer variable
 * depends of some boolean condition and print result to console
 *
 * Created by olegpoberezhets on 20.01.17.
 */
public class Lab147 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c;
        boolean condition1 = true;

        c = condition1 ? a: b;
        System.out.println(c);

        c = !condition1 ? a: b;
        System.out.println(c);

    }
}
