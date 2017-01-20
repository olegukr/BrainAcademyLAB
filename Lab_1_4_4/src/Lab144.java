/**
 *
 * Write a console program that prints result
 * of increment and decrement in prefix and
 * postfix mode for integer variable.
 *
 * Created by olegpoberezhets on 20.01.17.
 */

public class Lab144 {
    public static void main(String[] args) {

        int a = 1;
        System.out.println("a = 1");
        System.out.println("a++  " + a++);
        System.out.println("a = " + a);

        System.out.println("==========");
        a = 1;
        System.out.println("a = 1");
        System.out.println("++a " + ++a);
        System.out.println("a = " + a);

        System.out.println("==========");
        a = 1;
        System.out.println("a = 1");
        System.out.println("a--  " + a--);
        System.out.println("a = " + a);

        System.out.println("==========");
        a = 1;
        System.out.println("a = 1");
        System.out.println("--a " + --a);
        System.out.println("a = " + a);




    }
}
