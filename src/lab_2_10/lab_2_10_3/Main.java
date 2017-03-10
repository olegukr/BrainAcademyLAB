package lab_2_10.lab_2_10_3;


import java.util.Arrays;

/**
 * Open project MyShapes (from 2.8 labs).
 * Rewrite the class Shape to add new public static method called parseShape(String) which returns new object as Shape (one of shapes, such as triangle, rectangle and so on) based on string passed as argument.
 * Example of possible strings:
 * “Rectangle:RED:10,20”;
 * “Triangle:GREEN:9,7,12”;
 * “Circle:BLACK:10”.
 * In parseShape() method you must provide following steps:
 * 1. Determine type of shape object (using first word of string and switch statement);
 * 2. Determine and extract numeric values form string and parse it to double type (using Double.parseDouble() method), to use it as arguments to create particular Shape object.
 * 3. Create particular Shape object and pass it to return statement;
 * Add code to main() method in class Main, which creates one Rectangle, one Triangle
 * and one Circle using Shape.parseShape(String) method.
 * <p>
 * Created by olegpoberezhets on 03.03.17.
 */
public class Main {
    public static void main(String[] args) {

//        Shape[] shapes = new Shape[3];
//
//        shapes[0] = new Circle("GREEN", 10.0);
//        shapes[1] = new Rectangle("RED", 11.0, 22.0);
//        shapes[2] = new Triangle("BLACK", 5.0, 5.0, 5.0);
//
//        for (Shape shape : shapes) {
//            shape.draw();
//        }
//        System.out.println("--------");
//
//        Rectangle rectangle1 = new Rectangle("WHITE", 5.0, 6.0);
//        Rectangle rectangle2 = new Rectangle("WHITE", 7.0, 8.0);
//        System.out.println("rectangle1 - " + rectangle1.toString());
//        System.out.println("rectangle2 - " + rectangle2.toString());
//        System.out.print("rectangle1 area " + rectangle1.calcArea());
//        int result = rectangle1.compareTo(rectangle2);
//        switch (result) {
//            case -1:
//                System.out.print(" less ");
//                break;
//            case 0:
//                System.out.print(" equal ");
//                break;
//            case 1:
//                System.out.print(" more ");
//        }
//        System.out.println("rectangle2 area " + rectangle2.calcArea());
//        System.out.println("--------");
//
//        Rectangle[] arr2 = new Rectangle[6];
//        arr2[0] = new Rectangle("RED", 10.0, 10.0);
//        arr2[1] = new Rectangle("RED", 50.0, 6.0);
//        arr2[2] = new Rectangle("RED", 11.0, 22.0);
//        arr2[3] = new Rectangle("RED", 30.0, 4.0);
//        arr2[4] = new Rectangle("RED", 20.0, 25.0);
//        arr2[5] = new Rectangle("RED", 20.0, 2.0);
//        Arrays.sort(arr2);
//        for (Shape rectangle : arr2) {
//            rectangle.draw();
//        }
//        System.out.println("--------");
//
//
//        Shape[] shapesManyColors = new Shape[10];
//
//        shapesManyColors[0] = new Circle("BROWN", 10.0);
//        shapesManyColors[1] = new Rectangle("BLUE", 11.0, 22.0);
//        shapesManyColors[2] = new Triangle("BLACK", 5.0, 5.0, 5.0);
//        shapesManyColors[3] = new Circle("PINK", 10.0);
//        shapesManyColors[4] = new Rectangle("YELLOW", 11.0, 22.0);
//        shapesManyColors[5] = new Triangle("BLUE", 5.0, 5.0, 5.0);
//        shapesManyColors[6] = new Circle("GRAY", 10.0);
//        shapesManyColors[7] = new Rectangle("CYAN", 11.0, 22.0);
//        shapesManyColors[8] = new Triangle("ORANGE", 5.0, 5.0, 5.0);
//        shapesManyColors[9] = new Circle("GREEN", 10.0);
//
//        Arrays.sort(shapesManyColors, new ShapeColorComparator());
//
//        for (Shape shapesManyColor : shapesManyColors) {
//            shapesManyColor.draw();
//        }

        System.out.println(Shape.parseShape("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12"));
        System.out.println(Shape.parseShape("Circle:BLACK:10"));

    }

//output:
//    This is Circle, color: GREEN, radius=10.0, aria is: 314.1592653589793
//    This is Rectangle, color: RED, width=11.0, height=22.0, aria is: 242.0
//    This is Triangle, color: BLACK, a=5.0, b=5.0, c=5.0, aria is: 10.825317547305483
//            --------
//    rectangle1 - This is Rectangle, color: WHITE, width=5.0, height=6.0
//    rectangle2 - This is Rectangle, color: WHITE, width=7.0, height=8.0
//    rectangle1 area 30.0 less rectangle2 area 56.0
//            --------
//    This is Rectangle, color: RED, width=20.0, height=2.0, aria is: 40.0
//    This is Rectangle, color: RED, width=10.0, height=10.0, aria is: 100.0
//    This is Rectangle, color: RED, width=30.0, height=4.0, aria is: 120.0
//    This is Rectangle, color: RED, width=11.0, height=22.0, aria is: 242.0
//    This is Rectangle, color: RED, width=50.0, height=6.0, aria is: 300.0
//    This is Rectangle, color: RED, width=20.0, height=25.0, aria is: 500.0
//            --------
//    This is Triangle, color: BLACK, a=5.0, b=5.0, c=5.0, aria is: 10.825317547305483
//    This is Triangle, color: BLACK, a=5.0, b=5.0, c=5.0, aria is: 10.825317547305483
//    This is Rectangle, color: BLUE, width=11.0, height=22.0, aria is: 242.0
//    This is Circle, color: BROWN, radius=10.0, aria is: 314.1592653589793
//    This is Rectangle, color: CYAN, width=11.0, height=22.0, aria is: 242.0
//    This is Circle, color: GRAY, radius=10.0, aria is: 314.1592653589793
//    This is Circle, color: GREEN, radius=10.0, aria is: 314.1592653589793
//    This is Triangle, color: ORANGE, a=5.0, b=5.0, c=5.0, aria is: 10.825317547305483
//    This is Circle, color: PINK, radius=10.0, aria is: 314.1592653589793
//    This is Rectangle, color: YELLOW, width=11.0, height=22.0, aria is: 242.0

}
