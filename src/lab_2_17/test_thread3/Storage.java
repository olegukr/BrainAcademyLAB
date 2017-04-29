package lab_2_17.test_thread3;

/**
 * Created by olegpoberezhets on 4/9/17.
 */
public class Storage {
    private int n;
    int[] storages = new int[n];

    Storage(int n) {
        this.n = n;
        int[] storages = new int[n];
    }

    public void setStorages(int value, int indx) {
        this.storages[indx] = value;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


}

