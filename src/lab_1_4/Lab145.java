package lab_1_4;

/**
 *
 * Write a console program that prints result
 * of bit shift operators for integer variable.
 * * Student should declare and initialize
 * two integer variables as same value.
 * Student should apply bit shift operators
 * to first variable and divide or multiply
 * (by power of two) arithmetic operators for
 * second value, each time print result to console
 *
 * Created by olegpoberezhets on 20.01.17.
 */
public class Lab145 {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");

        int a = 0b1111_1111__0000_0000__1111_1111_0000_1100;
        int b = 0b1111_1111__0000_0000__1111_1111_0000_1100;

        System.out.println("a:         " + Integer.toBinaryString(a));
        System.out.println("b:         " + Integer.toBinaryString(b));

        a >>= 2;
        b = b / 4;
        System.out.println("a >> 2:    " + Integer.toBinaryString(a));
        System.out.println("b = b / 4: " + Integer.toBinaryString(b));
        System.out.println("--------------------------------------------");
/*

        --------------------------------------------
        a:         11111111000000001111111100001100
        b:         11111111000000001111111100001100
        a >> 2:    11111111110000000011111111000011
        b = b / 4: 11111111110000000011111111000011
        --------------------------------------------

*/
        System.out.println();
        System.out.println("--------------------------------------------");

        a = 0b1111_1111__0000_0000__1111_1111_0000_1100;
        b = 0b1111_1111__0000_0000__1111_1111_0000_1100;

        System.out.println("a:         " + Integer.toBinaryString(a));
        System.out.println("b:         " + Integer.toBinaryString(b));

        a <<= 2;
        b = b * 4;
        System.out.println("a << 2:    " + Integer.toBinaryString(a));
        System.out.println("b = b * 4: " + Integer.toBinaryString(b));
        System.out.println("--------------------------------------------");

/*
        --------------------------------------------
        a:         11111111000000001111111100001100
        b:         11111111000000001111111100001100
        a << 2:    11111100000000111111110000110000
        b = b * 4: 11111100000000111111110000110000
        --------------------------------------------
*/

        System.out.println();
        System.out.println("--------------------------------------------");
        a = 0b1111_1111__0000_0000__1111_1111_0000_1100;
        b = 0b1111_1111__0000_0000__1111_1111_0000_1100;
        System.out.println("a:         " + Integer.toBinaryString(a));
        System.out.println("b:         " + Integer.toBinaryString(b));

        a >>>= 2;
        b = b / 4;
        System.out.println("a >>> 2:     " + Integer.toBinaryString(a));
        System.out.println("b = b / 4: " + Integer.toBinaryString(b));
        System.out.println("--------------------------------------------");

/*      --------------------------------------------
        a:         11111111000000001111111100001100
        b:         11111111000000001111111100001100
        a >>> 2:   00111111110000000011111111000011
        b = b / 4: 11111111110000000011111111000011
*/
    }
}
