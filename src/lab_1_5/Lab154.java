package lab_1_5;

/**
 *
 * The program must print the first 10 numbers
 * that is divisible evenly by 3 or 4, but for loop iterates
 * from 1 to 300 (so break statement must be used after 10 printed result).
 * The output shall look:
 * 3
 * 4
 * …
 * 20
 *
 * Created by olegpoberezhets on 21.01.17.
 */
public class Lab154 {
    public static void main(String[] args) {

        int qNumbers = 10;
        for (int i = 1; i <= 300 ; i++) {
            if ((i % 3 == 0 )|| (i % 4 == 0)) {
                System.out.println(i);
                qNumbers--;
                if (qNumbers == 0) {
                    break;
                }
            }
        }
    }
}
