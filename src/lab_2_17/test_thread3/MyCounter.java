package lab_2_17.test_thread3;

/**
 * Created by olegpoberezhets on 4/9/17.
 */
public class MyCounter extends Storage{

    MyCounter(int n) {
        super(n);
    }

    public void run() {

        for (int i = 0; i < storages.length; i++) {
            setStorages(i,i);
        }
    }
}

