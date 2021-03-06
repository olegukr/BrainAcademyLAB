package lab_2_4;
import java.util.Arrays;

/**
 * 2.4.1:
 * Create class MyMath with two static methods (findMin and findMax),
 * which will take array of int values as argument and return
 * minimum element value (for findMin method) or
 * maximum element value (for findMax method).
 *
 * 2.4.2:
 * Create class Calculation, which will create two arrays of integers
 * and use findMin and findMax static methods of MyMath class.
 *
 * 2.4.3:
 * Add to class MyMath final static field PI = 3.14
 *  and static method areaOfCircle(), which will take radius, use constant PI and calculate area.
 *
 * Created by olegpoberezhets on 03.02.17.
 */
public class MyMath {

//    static field
    public static final float PI = (float) 3.14;


    public static int findMin(int[] arr) {

        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) if (arr[i] < minValue) minValue = arr[i];
        return minValue;
    }

    public static int findMax(int[] arr) {

        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) if (arr[i] > maxValue) maxValue = arr[i];
        return maxValue;
    }

    public static float areaOfCircle(float radius){
         float area = PI * radius * radius;
         return area;
    };

}

