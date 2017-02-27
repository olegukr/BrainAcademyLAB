package lab_2_7_6.testshapes;

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
public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double area  = Math.PI*radius*radius;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }
}
