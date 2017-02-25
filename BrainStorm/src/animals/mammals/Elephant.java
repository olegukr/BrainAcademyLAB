package animals.mammals;

import animals.Mammal;

/**
 * Created by olegpoberezhets on 12.02.17.
 */
public class Elephant extends Mammal {

    private static int elephantCount;
    private int elephantID;

    public Elephant() {
        elephantCount++;
        elephantID = elephantCount;
        setFood("grass");
    }

    public Elephant(int n) {

        for (int i = elephantCount-1; i < elephantCount + n; i++) {
//
        }
    }
}
