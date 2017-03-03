package lab_2_2;
/**
 * Create a Matrix class that contains the methods of addition and multiplication of matrices
 * (work with two-dimensional arrays);
 * <p>
 * Write class that create instances of class Matrix and execute his methods.
 * <p>
 * Created by olegpoberezhets on 02.02.17.
 */
public class Matrix {

    private int[][] arr1;

    public Matrix(int[][] arr1) {
        this.arr1 = arr1;
}

    public void fillArr1(int a, int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                arr1[i][i1] = i + i1 + a;
            }
        }
    }

    public static int[][] addMatrixes(int[][] arr1, int[][] arr2, int[][] arr3) {

        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                arr3[i][i1] = arr1[i][i1] + arr2[i][i1];

            }
        }
        return arr3;
    }

    public static int[][] multMatrixes(int[][] arr1, int[][] arr2, int[][] arr3) {
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                int sum = 0;
                for (int j = 0; j < arr1[i].length; j++) {
                    sum = sum + arr1[i][j]*arr2[j][i1];
                }
                arr3[i][i1] = sum;
            }
        }
        return arr3;
    }

    public void viewArr1(int[][] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                System.out.print(arr1[i][i1] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
