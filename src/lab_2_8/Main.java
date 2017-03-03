package lab_2_8;


import com.sun.org.apache.regexp.internal.RE;
import sun.security.provider.SHA;

/**
 * Created by olegpoberezhets on 03.03.17.
 */
public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("GREEN", 10.0);
        shapes[1] = new Rectangle("RED", 11.0, 22.0);
        shapes[2] = new Triangle("BLACK", 5.0, 5.0, 5.0);

        for (Shape shape : shapes) {
            shape.draw();
        }

        Rectangle rectangle1 = new Rectangle("WHITE", 5.0, 6.0);
        Rectangle rectangle2 = new Rectangle("WHITE", 7.0, 8.0);
        System.out.print("rectangle1 area " + rectangle1.calcArea());
        int result = rectangle1.compareTo(rectangle2);
        switch (result) {
            case -1:
                System.out.print(" меньше ");
                break;
            case 0:
                System.out.print(" равна ");
                break;
            case 1:
                System.out.print(" больше ");
        }
        System.out.println("rectangle2 area " + rectangle2.calcArea());
    }

//output:
//    This is Circle, color: GREEN, radius=10.0, aria is: 314.1592653589793
//    This is Rectangle, color: RED, width=11.0, height=22.0, aria is: 242.0
//    This is Triangle, color: BLACK, a=5.0, b=5.0, c=5.0, aria is: 10.82531754730548

}
