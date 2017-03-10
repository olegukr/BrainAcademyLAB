package lab_2_8;

/**
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

//    public abstract int compare(Object o1, Object o2);
}
