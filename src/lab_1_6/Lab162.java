package lab_1_6;

/**
 * There are statistics for the year by months
 * as an array: int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
 * Write code which calculates the maximum value from the array, the minimum value and the average.
 *
 * Created by olegpoberezhets on 25.01.17.
 */
public class Lab162 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int maxM = m[0];
        int minM = m[0];
        float sumM = 0;

        for (int i = 0; i < m.length; i++) {
            maxM = m[i] > maxM ? m[i] : maxM;
            minM = m[i] < minM ? m[i] : minM;
            sumM = sumM + m[i];
        }
        System.out.println("maximum: " + maxM);
        System.out.println("minimum: " + minM);
        System.out.println("average: " + sumM/m.length);
    }
}
