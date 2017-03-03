package lab_2_7_6.testshapes;

/**
 * Create new project named MyShapes. Add package “lab_2_7_6.lab_2_8”.
 You should design a super class Shape, which defines the public method of all
 the shapes called calcArea(), which returns the area (double type) of that particular shape.
 (Our program uses many kinds of shapes, such as triangle, rectangle and so on.)
 Define a Shape class as:
 public class Shape {
 //declare private instance variable shapeColor of String type
 // create a constructor for Shape with shapeColor parameter
 // Override  toString() to return the string of Shape name and color, example:
 “Shape, color is: RED”
 // All shapes must has a method called calcArea(),
 write public method (empty)  calcArea() that returns double value ( 0.0 ) .
 }
 Create class Main with method main().
 The program must demonstrate the creation of one Shape object and
 print it name and color to console.
 Then add code to invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Shape, color is: RED”
 “Shape area is: 0”
 * 1) Add to project  MyShapes a new class Circle which is a subclass of Shape.
 Add to class Circle a private field radius (of double type).
 In class Circle override  calcArea() method which must return area of circle
 (by the formula:  area  = PI*radius2).
 In class Circle override the toString() method. It must return string
 which contain name of shape, color and radius of circle. Example:
 “This is Circle, color: GREEN, radius=22”
 Add to class Circle constructor with color and radius arguments.
 2) Then add to class Main code to create one Circle object and print it name color,
 and radius to console. Then invoke calcArea() method and print result to console.
 Program output must looks like:
 “This is Circle, color: GREEN, radius=10”
 “Shape area is: 314.15926
 * Created by olegpoberezhets on 26.02.17.
 */
public class Shape {
//declare private instance variable shapeColor of String type
// create a constructor for Shape with shapeColor parameter
// Override  toString() to return the string of Shape name and color, example:
// “Shape, color is: RED”
// All shapes must has a method called calcArea(),
// write public method (empty)  calcArea() that returns double value ( 0.0 ) .

    private String shapeColor;
    String getShapeColor;


    public Shape(String shapeColor){

        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color:" + shapeColor;
    }

    public double calcArea(){
        return 0.0;
    };

}
