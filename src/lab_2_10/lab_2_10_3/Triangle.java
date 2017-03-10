package lab_2_10.lab_2_10_3;

import java.util.Comparator;

/**
 * Created by olegpoberezhets on 26.02.17.
 */
public class Triangle extends Shape implements Comparable, Comparator {
    private String shapeColor;
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        this.shapeColor = shapeColor;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcArea(){
        double area;
        double s = (a+b+c)/2.0;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return  area;
    }

    //    This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() +
                ", color: " + shapeColor +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle) o;
        if (this.calcArea() > triangle.calcArea()) return 1;
        if (this.calcArea() < triangle.calcArea()) return -1;
        return 0;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Triangle triangle1 = (Triangle) o1;
        Triangle triangle2 = (Triangle) o2;
        return triangle1.getShapeColor().compareTo(triangle2.getShapeColor());
    }

    public static Triangle parseTriangle( String s) {

        Triangle triangle;
        triangle = new Triangle(
                (s.substring(s.indexOf(":") + 1, s.lastIndexOf(":"))),
                Double.parseDouble(s.substring(s.lastIndexOf(":") + 1, s.indexOf(","))),
                Double.parseDouble(s.substring(s.indexOf(",") + 1, s.lastIndexOf(","))),
                Double.parseDouble(s.substring(s.lastIndexOf(",") + 1))
        );
        return triangle;
    }
}
