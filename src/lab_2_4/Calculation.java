package lab_2_4;

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
public class Calculation {

    public static void main(String[] args) {
        int arrMax;
        int arrMin;

        int[] arr1 = {12, 7, 5, 2, 34, 55};
        int[] arr2 = {34, 56, 32, 98, 33, 573, 55, 66, 78, 90};

        System.out.println("For arr1:");
        System.out.println("  - Min Value: " + MyMath.findMin(arr1));
        System.out.println("  - Max Value: " + MyMath.findMax(arr1));
        System.out.println();
        System.out.println("For arr2:");
        System.out.println("  - Min Value: " + MyMath.findMin(arr2));
        System.out.println("  - Max Value: " + MyMath.findMax(arr2));

        float r1 = (float) 10.1;
        System.out.println("Area of circle with R1 " + r1 + " = " + MyMath.areaOfCircle(r1));


    }
}
