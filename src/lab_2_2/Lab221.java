package lab_2_2;
/**
 * Create a Matrix class that contains the methods of addition and multiplication of matrices
 * (work with two-dimensional arrays);
 * <p>
 * Write class that create instances of class Matrix and execute his methods.
 * <p>
 * Created by olegpoberezhets on 02.02.17.
 */
public class Lab221 {
    public static void main(String[] args) {
        int[][] myM1 = new int[3][3];
        int[][] myM2 = new int[3][3];

        int[][] matrixAddResult = new int[3][3];
        int[][] matrixMultResult = new int[3][3];

        Matrix m1 = new Matrix(myM1);
        Matrix m2 = new Matrix(myM2);

        m1.fillArr1(1,myM1);
        m1.viewArr1(myM1);

        m2.fillArr1(2,myM2);
        m2.viewArr1(myM2);

        Matrix.addMatrixes(myM1,myM2,matrixAddResult);
        System.out.println("Add Matrixes: ");
        m1.viewArr1(matrixAddResult);

        Matrix.multMatrixes(myM1,myM2,matrixMultResult);
        System.out.println("Mult Matrixes: ");
        m1.viewArr1(matrixMultResult);

    }
//        1 2 3
//        2 3 4
//        3 4 5
//
//        2 3 4
//        3 4 5
//        4 5 6
//
//    Add Matrixes:
//            3 5 7
//            5 7 9
//            7 9 11
//
//    Mult Matrixes:
//            20 26 32
//            29 38 47
//            38 50 62

}

