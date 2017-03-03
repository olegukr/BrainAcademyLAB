package lab_2_8;

/**
 * Created by olegpoberezhets on 03.03.17.
 */
public abstract class Shape implements Drawable {

    abstract double calcArea();

    public  void draw(){
        System.out.println(toString() +
                ", aria is: " + calcArea());
    }
}
