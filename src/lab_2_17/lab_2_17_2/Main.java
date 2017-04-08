package lab_2_17.lab_2_17_2;

import lab_2_17.test_thread1.MyTimeBomb;

/**
 * Created by olegpoberezhets on 4/9/17.
 */
public class Main {
    public static void main(String[] args) {

        lab_2_17.test_thread1.MyTimeBomb bomb1 = new MyTimeBomb();
        bomb1.start();
    }
}
