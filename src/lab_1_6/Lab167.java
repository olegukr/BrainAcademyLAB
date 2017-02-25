import com.sun.org.apache.xpath.internal.functions.FuncFalse;

/**
 * Getting a practical experience in
 * Writing simple console application, using 2d arrays.
 * Write a program, which finds in a given matrix
 * the area of equal numbers.
 * Here is one example with an area containing 7 elements with equal value of 1:
 * <p>
 * The program must print to console:
 * Line 1: [0-2]
 * Line 2: [1,3]
 * Line 3: [4]
 * Line 4: [3]
 * <p>
 * Created by olegpoberezhets on 22.01.17.
 */
public class Lab167 {
    public static void main(String[] args) {
        int nn = 1;
        int[][] arr1 = {{1, 1, 1, 3, 4}, {2, 1, 3, 1, 2}, {2, 2, 3, 4, 1}, {3, 3, 3, 1, 4}};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Line " + (i+1) + ":[");
            boolean First = true;
            for (int i1 = 0; i1 < arr1[i].length; i1++) {

                if (arr1[i][i1] == nn) {
                    if ( First ) {
                        System.out.print(i1);
                        First = false;
                    } else {
                        System.out.print("," + i1);
                    }
                }
            }
            System.out.println("]");
        }
    }

}
