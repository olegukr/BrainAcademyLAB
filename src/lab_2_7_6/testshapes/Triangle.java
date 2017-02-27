package lab_2_7_6.testshapes;

/**
 * Created by olegpoberezhets on 26.02.17.
 */
public class Triangle extends Shape{

    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
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

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b + ", c=" +c;
    }
}
