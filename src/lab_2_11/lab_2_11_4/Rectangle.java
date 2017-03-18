package lab_2_11.lab_2_11_4;

import java.util.Comparator;

/**
 * Created by olegpoberezhets on 27.02.17.
 */
public class Rectangle extends Shape implements Comparable, Comparator {
    private String shapeColor;
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        this.shapeColor = shapeColor;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = width * height;
        return area;
    }

    //    This is Rectangle, color: RED, width=11, height=22, area is: 242
    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() +
                ", color: " + shapeColor +
                ", width=" + width +
                ", height=" + height;
    }
    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calcArea() > rectangle.calcArea()) return 1;
        if (this.calcArea() < rectangle.calcArea()) return -1;
        return 0;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Rectangle rectangle1 = (Rectangle) o1;
        Rectangle rectangle2 = (Rectangle) o2;
        return  rectangle1.getShapeColor().compareTo(rectangle2.getShapeColor());
    }

public static Rectangle parseRectangle(String s){

            Rectangle rectangle = new Rectangle(
                    (s.substring(s.indexOf(":")+1, s.lastIndexOf(":"))),
                    Double.parseDouble(s.substring(s.lastIndexOf(":")+1, s.indexOf(","))),
                    Double.parseDouble(s.substring(s.lastIndexOf(",")+1))
            );
            return rectangle;

}
//    Open project MyShapes (from 2.8 labs).
//    Rewrite the Rectangle class to add new public static method
//    called parseRectangle (String)
//    which returns new object as Rectangle type
//    based on string passed as argument.
//    Example of possible strings:
//    “Rectangle:RED:5,6”;
//    “Rectangle:RED:10,20”;
//    “Rectangle:RED:33,44”;
//    In parseRectangle() method you must determine and extract numeric values
//    form string and parse it to double type (using Double.parseDouble() method),
//    to use it as arguments to create Rectangle object and pass it to return statement;
//    Provide the same changes (add parse...() method) in Triangle and Circle classes.
//    Rewrite the Shape.parseShape(String) method in Shape class
//  to use invocation of particular parse...() method
//  for each shape object type (in switch statement).
//    For example:
//            Rectangle.parseRectangle (String) method
//  to parse string in case of Rectangle object. Execute program.
}
