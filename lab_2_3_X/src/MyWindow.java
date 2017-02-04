/**
 * 1) Create class MyWindow with fields width (of double type), height (of double type),
 * numberOfGlass(of int type), color(of String type), isOpen(boolean).
 * 2) Create five instances of class MyWindow with different fields values.
 * 3) Add method printFields() to MyWindow class that print all fields values to console.
 * <p>
 * Add to class MyWindow overload constructors, which will initialize class’ fields, depend from what data we will put there:
 * MyWindow(width, height), MyWindow(width, height, numberOfGlass). Finally class MyWindow must have four constructors.
 * <p>
 * Created by olegpoberezhets on 02.02.17.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberoOfGlass;
    private String color;
    private boolean isOpen;

    MyWindow(double width, double height, int numberoOfGlass,
             String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberoOfGlass = numberoOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    MyWindow() {
        this.width = 70.0;
        this.height = 120.0;
        this.numberoOfGlass = 2;
        this.color = "white";
        this.isOpen = true;
    }

    MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    MyWindow(double width, double height, int numberoOfGlass) {
        this.width = width;
        this.height = height;
        this.numberoOfGlass = numberoOfGlass;
    }

    public void printFields() {
        System.out.println("MyWindow" +
                "width=" + width +
                ", height=" + height +
                ", numberoOfGlass=" + numberoOfGlass +
                ", color='" + color +
                ", isOpen=" + isOpen);
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberoOfGlass() {
        return numberoOfGlass;
    }

    public void setNumberoOfGlass(int numberoOfGlass) {
        this.numberoOfGlass = numberoOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
