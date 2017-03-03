package lab_2_8;

/**
 * Created by olegpoberezhets on 27.02.17.
 */
public class Rectangle extends Shape {
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
}
