/**
 * Write a program, which creates square matrix like those in the figure below
 * and prints them formatted to the console. The size of the matrix is 4 x 4:
 * <p>
 * 1 5  9 13
 * 2 6 10 14
 * 3 7 11 15
 * 4 8 12 16
 * <p>
 * Created by olegpoberezhets on 26.01.17.
 */
public class Lab163 {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][4];
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                arr1[i][i1] = 4 * i1 + 1 + i;
                System.out.print(arr1[i][i1] + " ");
            }
            System.out.println(" ");
        }
    }
}
