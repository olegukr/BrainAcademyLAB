package lab_2_17.lab_2_17_2;

/**
 * Created by olegpoberezhets on 4/9/17.
 */
public class MyTimeBomb implements Runnable {

@Override
public void run(){
    for (int  i=10; i >= 0; i--) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }
        System.out.println("Boom!!!");

    }


}

