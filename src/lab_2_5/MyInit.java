package lab_2_5;

import java.util.Random;

/**
 * Create class MyInit with field arr of array of integers
 * and non-static initialization block which will initialize
 * that array with random values (Size of array is 10).
 * To generate random numbers you can use next code: arr[i]= (int) (100 * Math.random()).
 * (Or using Random class instance and nextInt() method invocation).
 *
 * Add to class MyInit and method printArray() which will print values of this array.
 * Create class Main, which will create two instances of class MyInit and invoke method printArray()
 * to print values of their arrays on console.
 * Example of output: 23,43,11,34,78,59,34,61,24,2 5,48,50,3,1,4,67,62,78,98
 *
 * 253:
 * Change MyInit class: * change MyInit field arr to static field. Compile and run. What will you see and why?
 *
 * 254:
 * Change MyInit class: * change initialization block to static initialization block. Compile and run. What will you see and why?
 *
 * Created by olegpoberezhets on 05.02.17.
 */
public class MyInit {
    static int[] arr = new int[10];

    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (100 * Math.random());
        }

    }

    public static void printArray(){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
