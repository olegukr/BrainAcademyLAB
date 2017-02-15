package example.testpack;

import com.brainacad.carpack.Car;
import example.applepack.Apple;

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
