import sun.jvm.hotspot.types.basic.BasicOopField;

/**
 * Created by olegpoberezhets on 21.01.17.
 */
public class ManGetUp {

    public static void main(String[] args) {

        boolean male = true;

        final int TIME_OF_AWAKENESS = 10;
        int currentTime = TIME_OF_AWAKENESS;

        if (currentTime < 9) {
            System.out.println("Go to Bazar. Time: " + currentTime);
            currentTime++;
        }
        if (currentTime < 10) {
            if (male) {
                System.out.println("Man go to Gym. Time: " + currentTime);
            } else {
                System.out.println("Female Go to Sadik. Time: " + currentTime);
            }
            currentTime++;
        }
        System.out.println("Go to Work. Time: " + currentTime);
    }
}
