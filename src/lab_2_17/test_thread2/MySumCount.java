package lab_2_17.test_thread2;

/**
 * Created by olegpoberezhets on 4/9/17.
 */
public class MySumCount extends Thread {
    int startIndex;
    int stopIndex;
    int[] arr;
    long resultSum = 0L;

    public MySumCount(int startI, int stopI, int[] arrIn){
        startIndex = startI;
        stopIndex = stopI;
        arr =    arrIn;
    }

    public void run(){
        for (int i= startIndex; i < stopIndex; i++){
            resultSum = resultSum + arr[i];
        }
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }


    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;

    }
}
