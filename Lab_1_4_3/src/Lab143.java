/**
 * Created by olegpoberezhets on 15.01.17.
 *
 * Write a console program that prints result
 * of each of arithmetic logical (AND, OR, NOT, XOR)
 * for two variables of boolean data type.
 *
=======
>>>>>>> branch_20_22
 */
public class Lab143 {
    public static void main(String[] args) {

        boolean T = true;
        boolean F = false;

        System.out.println("Logical AND:");
        System.out.println("false AND false = " + (F && F));
        System.out.println("false AND true  = " + (F && T));
        System.out.println("true  AND false = " + (T && F));
        System.out.println("true  AND true  = " + (T && T));
        System.out.println();

        System.out.println("Logical OR:");
        System.out.println("false OR false = " + (F || F));
        System.out.println("false OR true  = " + (F || T));
        System.out.println("true  OR false = " + (T || F));
        System.out.println("true  OR true  = " + (T || T));
        System.out.println();

        System.out.println("Logical NOT:");
        System.out.println("NOT false = " + (!T));
        System.out.println("NOT true  = " + (!F));
        System.out.println();

        System.out.println("Logical XOR:");
        System.out.println("false XOR false = " + (F ^ F));
        System.out.println("false XOR true  = " + (F ^ T));
        System.out.println("true  XOR false = " + (T ^ F));
        System.out.println("true  XOR true  = " + (T ^ T));
    }
}
