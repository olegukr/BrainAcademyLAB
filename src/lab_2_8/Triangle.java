package lab_2_8;

/**
 * Created by olegpoberezhets on 26.02.17.
 */
public class Triangle extends Shape {
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
                ", c=" +c;
    }
}
