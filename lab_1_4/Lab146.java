/**
 *
 * Write a console program that prints result of Bitwise operators for two integer variables.
 * Student should declare and initialize two integer variables. * Student should apply
 * each of Bitwise operators declared variables and time print result to console
 *
 * Created by olegpoberezhets on 20.01.17.
 */
public class Lab146 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 0x9B_13_FE_17;
        b = 0xFF_FF_00_00;

        System.out.println("==========================================");
        System.out.println("a       : " + Integer.toBinaryString(a));
        System.out.println("b       : " + Integer.toBinaryString(b));
        c = a & b;
        System.out.println("a AND b : " + Integer.toBinaryString(c));
        System.out.println("==========================================");

        System.out.println("a       : " + Integer.toBinaryString(a));
        System.out.println("b       : " + Integer.toBinaryString(b));
        c = a | b;
        System.out.println("a OR b  : " + Integer.toBinaryString(c));
        System.out.println("==========================================");

        System.out.println("a       : " + Integer.toBinaryString(a));
        System.out.println("b       : " + Integer.toBinaryString(b));
        c = a ^ b;
        System.out.println("a XOR b  : " + Integer.toBinaryString(c));
        System.out.println("==========================================");

        System.out.println("a       : " + Integer.toBinaryString(a));
//        System.out.println("b       : " + Integer.toBinaryString(b));
        c = ~a;
        System.out.println("NOT a    : " + Integer.toBinaryString(c));
        System.out.println("==========================================");
    }
}
