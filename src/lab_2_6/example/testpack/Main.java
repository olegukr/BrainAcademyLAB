package lab_2_6.example.testpack;

import lab_2_6.example.applepack.Apple;
import lab_2_6.com.brainacad.carpack.Car;

/**
 * Created by olegpoberezhets on 11.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Apple a = new Apple();
        Car c = new Car();
        System.out.println("Apple weight: " + a.getMass());
        System.out.println("Car weight: " + c.getMass());
    }
}
