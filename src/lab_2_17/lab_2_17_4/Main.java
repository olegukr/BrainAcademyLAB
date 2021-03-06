package lab_2_17.lab_2_17_4;


import lab_2_17.test_thread2.MySumCount;

/**
 * Created by olegpoberezhets on 4/9/17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] myArray = new int[1000];

        for (int i = 0; i < myArray.length; i++) {
        myArray[i] = (int) (Math.random() * 1000);
            System.out.print(myArray[i] + ",");
        }
        System.out.println();
        System.out.println("=======");

        lab_2_17.test_thread2.MySumCount mySumCount1 = new lab_2_17.test_thread2.MySumCount(0, 499, myArray);
        lab_2_17.test_thread2.MySumCount mySumCount2 = new MySumCount(500, 999, myArray);
        Thread thr1 = new Thread(mySumCount1);
        Thread thr2 = new Thread(mySumCount2);

        thr1.start();
        thr2.start();

        thr1.join();
        thr2.join();

        System.out.println(mySumCount1.getResultSum());
        System.out.println(mySumCount2.getResultSum());
        System.out.println(mySumCount1.getResultSum()+mySumCount2.getResultSum());
    }
}
