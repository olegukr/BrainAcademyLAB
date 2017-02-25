package lab_1_5;
import java.util.Scanner;

/**
 * Write a program that find and displays all perfect numbers
 * from 1 to n (perfect number is a positive integer
 * that is equal to the sum of its proper positive divisors,
 * excluding the number itself).
 *
 * Created by olegpoberezhets on 22.01.17.
 */
public class Lab157 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number \"n\" ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 1; i < n; i++) {
                int sumReminder = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sumReminder = sumReminder + i;
                    }
                }
                if (sumReminder == i) {
                    System.out.println(sumReminder);
                }
            }
        }


    }
}
