package lab_2_7_6.testshapes;

/**
 * Created by olegpoberezhets on 27.02.17.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", height=" + height;
    }
}
