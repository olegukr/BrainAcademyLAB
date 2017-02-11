/**
 * The value of π can be calculated with the series: π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
 * Write a class MyCalc with public static method calcPi(int) that takes as parameter an integer n, and computes
 * and returns the value of π approximated to the first n terms of the series.
 *
 * Created by olegpoberezhets on 05.02.17.
 */
public class Lab245 {
    public static void main(String[] args) {
        System.out.println("pi:      " + MyCalc.calcPi(10000));
        System.out.println("Math.PI: " + Math.PI);
    }

}
