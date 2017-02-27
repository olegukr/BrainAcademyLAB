package lab_2_7_6.testshapes;


/**
 * Created by olegpoberezhets on 26.02.17.
 */
public class Main {
    public static void main(String[] args) {

     Shape shape = new Shape("Red");
        toPrint(shape);
        Circle circle = new Circle("GREEN", 10.0);
        toPrint(circle);
        Rectangle rectangle= new Rectangle("RED", 11.0, 22.0);
        toPrint(rectangle);
        Triangle triangle = new Triangle("BLACK",5.0,5.0,5.0);
        toPrint(triangle);
    }

    public static void toPrint(Shape shape) {
        System.out.println("This is " + shape.toString());
        System.out.println(  "Shape area is: " + shape.calcArea());
    }


}
