package lab_1_5;

/**
 *
 * Write a program to produce on console the following :
 * 1
 * 2 1
 * 3 2 1
 * 4 3 2 1
 * 5 4 3 2 1
 * 6 5 4 3 2 1
 * 7 6 5 4 3 2 1
 * 8 7 6 5 4 3 2 1
 *
 * Created by olegpoberezhets on 21.01.17.
 */
public class Lab151 {
    public static void main(String[] args) {
       for (int k = 1; k < 9; k++) {
           for (int i = k; i > 0; i--) {
               System.out.print(i + " ");
           }
           System.out.println();
       }
    }
}