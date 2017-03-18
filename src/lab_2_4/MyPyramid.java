package lab_2_4;
import java.util.Arrays;

/**
 * Write a class MyPyramid with public static method printPyramid(int h)
 * that takes parameter an integer h between 1 and 9,
 * and prints a pyramid of numbers of height h. Example:
 * For h = 4 the method should print the pyramid
 * 1
 * 121
 * 12321
 * 1234321
 * <p>
 * Created by olegpoberezhets on 08.02.17.
 */
public class MyPyramid {


    public static void printPyramid(int h) {

        if (h <= 9 && h >= 1) {
            int[][] arr = new int[h][2 * h - 1];

            for (int i = 0; i < arr.length; i++) {
                for (int i1 = 0; i1 < h; i1++) arr[i][i1] = i1 - h + i + 2;
                for (int i1 = h; i1 < 2 * h - 1; i1++) arr[i][i1] = h - i1 + i;
            }

            for (int i = 0; i < arr.length; i++) {
                for (int i1 = 0; i1 < arr[i].length; i1++)
                    if (arr[i][i1] > 0) System.out.print(arr[i][i1]);
                    else System.out.print(" ");
                System.out.println();
            }
        } else System.out.println(" \"h\" must be from 1 to 9!");
    }
}


