import java.util.Scanner;

/**
 * Writing simple console application, using loop and arithmetic operators.
 * Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
 * Also compute and display the average.
 * The output shall look like:
 * The Sum is: 100
 * The Avg is: 10
 *
 * Created by olegpoberezhets on 21.01.17.
 */
public class Lab155 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number \"n\" ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sumIs = 0;
            for (int i = 1; i <= n; i++) {
                sumIs = sumIs + i;
            }
            float avgIs = (float) sumIs / n;
            System.out.println("The Sum is: " + sumIs);
            System.out.println("The Avg is: " + avgIs);
//            System.out.println("The Math Sum is: " + n * (n + 1) / 2);
//            System.out.println("The Math Avg is: " + (n + 1) / 2);
        }
    }
}
