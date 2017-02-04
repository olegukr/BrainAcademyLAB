/**
 *
 * Write a program, which uses a binary search
 * in a sorted array of integer numbers to find a certain element.
 *
 * Created by olegpoberezhets on 26.01.17.
 */
public class Lab164 {

    public static void main(String[] args) {
        int searchElement = 45;
        int[] arr1 = {3, 5, 9, 15, 17, 45, 45, 45, 89};

        int indexMax = arr1.length - 1;
        int indexMin = 0;
        int arrIndex = 0;
        System.out.println("Seaching element: " + searchElement);
        int numerOfSirch=0;
        do {
            arrIndex = (int) (indexMax + indexMin) / 2;
            numerOfSirch++;
            if (searchElement < arr1[arrIndex]) {
                indexMax = arrIndex - 1;
            } else if (searchElement > arr1[arrIndex]) {
                indexMin = arrIndex + 1;
            }
            if (indexMin > indexMax) {
                System.out.print("Not found. Near element ");
                break;
            }
        } while (searchElement != arr1[arrIndex]);

        System.out.println("arr1[" + arrIndex + "] = " + arr1[arrIndex]);

        for (int i=1; arr1[arrIndex]==arr1[arrIndex-i]; i++) {
            System.out.println("arr1[" + (arrIndex-i) + "] = " + arr1[arrIndex-i]);
        }
        for (int i=1; arr1[arrIndex]==arr1[arrIndex+i]; i++) {
            System.out.println("arr1[" + (arrIndex+i) + "] = " + arr1[arrIndex+i]);
        }
        System.out.println("Количество циклов: " + numerOfSirch);

    }
}
