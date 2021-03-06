package lab_1_5;

/**
 * Write a program to produce the multiplication table
 * of 1 to 9 as shown using two nested for-loops:
 *
 * * | 1 2 3 4 5 6 7 8 9
 * --------------------------------------
 * 1 | 1 2 3 4 5 6 7 8 9
 * 2 | 2 4 6 8 10 12 14 16 18
 * 3 | 3 6 9 12 15 18 21 24 27
 * 4 | 4 8 12 16 20 24 28 32 36
 * 5 | 5 10 15 20 25 30 35 40 45
 * 6 | 6 12 18 24 30 36 42 48 54
 * 7 | 7 14 21 28 35 42 49 56 63
 * 8 | 8 16 24 32 40 48 56 64 72
 * 9 | 9 18 27 36 45 54 63 72 81
 *
 * Created by olegpoberezhets on 21.01.17.
 */
public class Lab153 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i != 0) System.out.println();
            int nRow = i;
            if (i == 1) System.out.println("------------------------------");
            for (int j = 0; j < 10; j++) {
                int nColumn = j;

                if (nColumn == 0) if (nRow == 0) System.out.print("* | ");
                else System.out.print(nRow + " | ");
                else if (nRow == 0) System.out.print(nColumn + " ");
                else System.out.print(nColumn * nRow + " ");
            }
        }
    }
}
