/**
 *
 * Write a console program that prints result
 * of bit shift operators for integer variable.
 *
 * Created by olegpoberezhets on 20.01.17.
 */
public class Lab145 {
    public static void main(String[] args) {
        int a = 0b0000_1100;
        int b = 0b0000_1100;
        System.out.println("a: " + Integer.toBinaryString(a));
        System.out.println("b: " + Integer.toBinaryString(b));

        System.out.println("==========");
        a >>= 2;
        b = b / 4;
        System.out.println("a >> 2: " + Integer.toBinaryString(a));
        System.out.println("b = b / 4: " + Integer.toBinaryString(b));

        System.out.println("==========");
        a <<= 2;
        b = b * 4;
        System.out.println("a << 2: " + Integer.toBinaryString(a));
        System.out.println("b = b * 4: " + Integer.toBinaryString(b));
    }
}
