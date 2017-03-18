package lab_2_3;

/**
 *
 * 1) Create class MyWindow with fields width (of double type), height (of double type),
 * numberOfGlass(of int type), color(of String type), isOpen(boolean).
 * 2) Create five instances of class MyWindow with different fields values.
 * 3) Add method printFields() to MyWindow class that print all fields values to console.
 * 2-3-4
 *1. Create array of MyWindow’s and fill it by creating MyWindow’s objects using different constructors.
 *  2. Call method printFields() on each array element.
 * Created by olegpoberezhets on 02.02.17.
 */
public class Lab231 {
    public static void main(String[] args) {
        MyWindow window1 = new MyWindow(70.0, 120.0, 2, "white", false );
        MyWindow window2 = new MyWindow(70.0, 120.0, 2, "white", true );
        MyWindow window3 = new MyWindow(80.0, 120.0, 3, "white", false );
        MyWindow window4 = new MyWindow(90.0, 140.0, 3, "white", true );
        MyWindow window5 = new MyWindow(100.0, 160.0, 3, "white", false );


        window1.printFields();
        window2.printFields();
        window3.printFields();
        window4.printFields();
        window5.printFields();

        System.out.println("Default window: ");
        MyWindow window6 = new MyWindow();
        window6.printFields();

        System.out.println("Array of windows: ");
        MyWindow[] windows = new MyWindow[4];
        windows[0] = new MyWindow();
        windows[1] = new MyWindow(75.0,125.0);
        windows[2] = new MyWindow(75.0,125.0, 4);
        windows[3] = new MyWindow(75.0, 125.0, 4, "red" , true );

        for (MyWindow window : windows) window.printFields();


    }
}
