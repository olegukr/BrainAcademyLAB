package lab_2_4;

/**
 * The value of π can be calculated with the series: π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 * Write a class MyCalc with public static method calcPi(int) that takes as parameter an integer n, and computes
 * and returns the value of π approximated to the first n terms of the series.
 * <p>
 * Created by olegpoberezhets on 05.02.17.
 */
public class MyCalc {

    public static double calcPi(int n) {
        double pi = 0.0, b = 0.0;

        for (int i = 0; i < n; i++) {
            b = 4.0 / (2*i + 1.0);
            if (i % 2 != 0) pi -= b;
            else pi += b;
        }
        return pi;
    }
}
