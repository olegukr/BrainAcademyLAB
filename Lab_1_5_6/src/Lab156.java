import java.util.Scanner;

/**
 * Write a program that calculates and displays the sum of squares of digits of number
 *
 * Created by olegpoberezhets on 22.01.17.
 */
public class Lab156 {
    public static void main(String[] args) {
        System.out.println("Please, enter the number \"n\" ");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            int sumIs = 0;
            float floatN = (float) n;
            float remainderFromDev10;

            for (int i = 1; i < 300; i++) {
                remainderFromDev10 = floatN % 10;
                floatN = (floatN - remainderFromDev10) / 10;
                sumIs = (int) (remainderFromDev10 * remainderFromDev10 + sumIs);

                if (floatN < 1) {
                    System.out.println(sumIs);
                    break;
                }
            }
        }
    }
}
