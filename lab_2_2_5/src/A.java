/**
 * Write class A with overridden methods calcSquare
 * that calculate square of rectangle, square of foursquare
 * and square of circle and print result.
 * Write class that will use these methods.
 * <p>
 * Write class with method that will take final integer
 * and assign to it the square of this integer and print result.
 * What will you get? Explain result.
 * <p>
 * Created by olegpoberezhets on 02.02.17.
 */
public class A {
    private int a;
    private int b;
    private float r;
    public float square = 0;


    //foursquare
    public float calcSquare(int a) {
        this.a = a;
        square = this.a * this.a;
        System.out.println("Square of foursquare: " + square);
        return square;
    }

    //rectangle
    public float calcSquare(int a, int b) {
        this.a = a;
        this.b = b;
        square = this.a * this.b;
        System.out.println("Square of rectangle: " + square);
        return square;
    }

    //circle
    public float calcSquare(float r) {
        this.r = r;
        square = (float) ( Math.PI * this.r * this.r);
        System.out.println("Square of circle: " + square);
        return square;
    }
}
