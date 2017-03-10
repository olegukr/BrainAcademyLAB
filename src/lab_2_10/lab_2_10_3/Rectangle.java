package lab_2_10.lab_2_10_3;

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


}
