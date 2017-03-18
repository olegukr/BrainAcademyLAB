package lab_2_11.lab_2_11_4;

/**
 * Open project MyShapes (from 2.8 labs).
 * Rewrite the class Shape to add new public static method
 * called parseShape(String)
 * which returns new object as Shape
 * (one of shapes, such as triangle, rectangle and so on)
 * based on string passed as argument.
 * In parseShape() method you must provide following steps:
 * 1. Determine type of shape object
 * (using first word of string and switch statement);
 * 2. Determine and extract numeric values form string
 * and parse it to double type (using Double.parseDouble() method),
 * to use it as arguments to create particular Shape object.
 * 3. Create particular Shape object and pass it to return statement;
 * which returns new object as Shape
 * (one of shapes, such as triangle, rectangle and so on)
 * based on string passed as argument.
 * <p>
 * Example of possible strings:
 * “Rectangle:RED:10,20”;
 * “Triangle:GREEN:9,7,12”;
 * “Circle:BLACK:10”.
 * <p>
 * Created by olegpoberezhets on 03.03.17.
 */
public abstract class Shape implements Drawable {

    abstract double calcArea();

    private String shapeColor;

    public void draw() {
        System.out.println(toString() +
                ", aria is: " + calcArea());
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public static Shape parseShape(String s) {

        Shape shape = null;

        switch ((s.substring(0, s.indexOf(":")))) {

            //  “Rectangle:RED:10,20”;
            case "Rectangle":
//                shape = new Rectangle(
//                        (s.substring(s.indexOf(":")+1, s.lastIndexOf(":"))),                     // "RED"
//                        Double.parseDouble(s.substring(s.lastIndexOf(":")+1, s.indexOf(","))),   // "10"
//                        Double.parseDouble(s.substring(s.lastIndexOf(",")+1))                    // "20"
//                );

                shape = Rectangle.parseRectangle(s);
                return shape;


                //  “Triangle:GREEN:9,7,12”;
            case "Triangle":
//                shape = new Triangle(
//                        (s.substring(s.indexOf(":") + 1, s.lastIndexOf(":"))),                     // "GREEN"
//                        Double.parseDouble(s.substring(s.lastIndexOf(":") + 1, s.indexOf(","))),   // "9"
//                        Double.parseDouble(s.substring(s.indexOf(",") + 1, s.lastIndexOf(","))),    // "7"
//                        Double.parseDouble(s.substring(s.lastIndexOf(",") + 1))                      // "12"
//                );

                shape =  Triangle.parseTriangle(s);
                return shape;


            //  “Circle:BLACK:10”
            case "Circle":
//                shape = new Circle((s.substring(s.indexOf(":") + 1, s.lastIndexOf(":"))),           // "BLACK"
//                        Double.parseDouble(s.substring(s.lastIndexOf(":") + 1))                     // "10"
//                );

                shape = Circle.parseCircle(s);
                return shape;
        }
        return shape;
    }
}




