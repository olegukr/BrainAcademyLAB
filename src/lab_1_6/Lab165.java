package lab_1_6;

/**
 * Write a program, which transpose matrix (2d arrays, size 4x4)
 * and outputs it to the console
 * <p>
 * Created by olegpoberezhets on 27.01.17.
 */
public class Lab165 {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][4];
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                arr1[i][i1] = 4 * i1 + 1 + i;
                System.out.print(arr1[i][i1] + " ");
            }
            System.out.println(" ");
        }
        int b = 0;
        for (int i = 0; i < arr1.length; i++)
            for (int i1 = 0 + i; i1 < arr1[i].length; i1++) {
                b = arr1[i1][i];
                arr1[i1][i] = arr1[i][i1];
                arr1[i][i1] = b;
            }
        System.out.println();
        for (int i1 = 0; i1 < arr1.length; i1++) {
            for (int i2 = 0; i2 < arr1.length; i2++) System.out.print(arr1[i1][i2] + " ");
            System.out.println();
        }

    }

}

