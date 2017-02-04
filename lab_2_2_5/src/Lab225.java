/**
 *
 * Write class A with overridden methods calcSquare
 * that calculate square of rectangle, square of foursquare
 * and square of circle and print result.
 * Write class that will use these methods.
 *
 * Write class with method that will take final integer
 * and assign to it the square of this integer and print result.
 * What will you get? Explain result.
 *
 * Created by olegpoberezhets on 02.02.17.
 */
public class Lab225 {
    public static void main(String[] args) {
        A forsquare = new A();
        forsquare.calcSquare(4);

        A rectangle = new A();
        rectangle.calcSquare(6,5);

        A circle = new A();
        circle.calcSquare((float) 10.0);

        int test = 4;
        Square.sq(test);

    }
}
