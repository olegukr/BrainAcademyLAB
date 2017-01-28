/**
 *
 * Write a program, which uses a binary search
 * in a sorted array of integer numbers to find a certain element.
 *
 * Created by olegpoberezhets on 26.01.17.
 */
public class Lab164 {
    public static void main(String[] args) {
        int searchElement = 5;
        int[] arr1 = {3, 5, 9, 15, 17, 45, 89};
        int indexMax = arr1.length - 1;
        int indexMin = 0;
        int arrIndex = 0;
        for (int i = 0; i < 10; i++) {
            arrIndex = indexMin + (indexMax - indexMin) / 2;
            if (searchElement == arr1[arrIndex]) {
                System.out.println("arr1[" + arrIndex + "] = " + arr1[arrIndex]);
                System.out.println("Количество циклов: " + i);
                break;
            } else if (searchElement < arr1[arrIndex]) {
                indexMax = indexMin + (indexMax - indexMin) / 2;
            } else if (searchElement > arr1[arrIndex]) {
                indexMin = indexMin + (indexMax - indexMin) / 2;
            }
        }
        System.out.println("Not found. Neast arr1[" + arrIndex + "] = " + arr1[arrIndex]);
    }
}
