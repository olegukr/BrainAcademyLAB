package lab_2_8;


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
    }


}
