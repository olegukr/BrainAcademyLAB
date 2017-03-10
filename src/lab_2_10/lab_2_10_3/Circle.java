package lab_2_10.lab_2_10_3;

import java.util.Comparator;

/**
 * 1) Add to project  MyShapes a new class Circle which is a subclass of Shape.
 Add to class Circle a private field radius (of double type).
 In class Circle override  calcArea() method which must return area of circle
 (by the formula:  area  = PI*radius2).
 In class Circle override the toString() method. It must return string which contain name of shape, color and radius of circle. Example:
 “This is Circle, color: GREEN, radius=22”
 Add to class Circle constructor with color and radius arguments.
 2) Then add to class Main code to create one Circle object and print it name color, and radius to console. Then invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Circle, color: GREEN, radius=10”
 “Shape area is: 314.15926”
 * Created by olegpoberezhets on 26.02.17.
 */
public class Circle extends Shape implements Comparable, Comparator {
    private double radius;
    private String shapeColor;


    public Circle(String shapeColor, double radius) {
        this.shapeColor = shapeColor;
        this.radius = radius;
    }

//This is Circle, color: GREEN, radius=10, area is: 314.15926
    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() +
                ", color: " + shapeColor +
                ", radius=" + radius ;
    }

    @Override
    public double calcArea() {
        double area  = Math.PI*radius*radius;
        return area;
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calcArea() > circle.calcArea()) {
            return 1;
        }
        if (this.calcArea() < circle.calcArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Circle circle1 = (Circle) o1;
        Circle circle2 = (Circle) o2;
        return  circle1.getShapeColor().compareTo(circle2.getShapeColor());
    }

    public String getShapeColor() {
        return shapeColor;
    }
}
