/**
 *
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30)
 * and display elements of the array to the screen.
 *
 * Created by olegpoberezhets on 25.01.17.
 */
public class Lab161 {
    public static void main(String[] args) {
        int [] arr1 = new int[15];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (i+1)*2;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
