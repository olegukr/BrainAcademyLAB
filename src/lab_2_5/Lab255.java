package lab_2_5;

/**
 * Write class InitTest with private field id of int type and static private field nextId of integer.
 * Write code that: * Initialize static field nextId of some random value (in 1 … 1000 range) once
 * when class loaded to JVM;
 * Increments static field nextId each time when new instance of InitTest created;
 * Initialize field id of nextId field value each time when new instance of InitTest created.
 * And method getId() which will return value of id.
 * Create class Main, which will create five instances of class InitTest and invokes method getId()
 * on each instance and print returned value on console.
 *
 * Created by olegpoberezhets on 10.02.17.
 */
public class Lab255 {

    public static void main(String[] args) {
        System.out.println("nextId: " + InitTest.getNextId());

        InitTest    i1 = new InitTest();
        System.out.println(i1.getId());

        InitTest    i2 = new InitTest();
        System.out.println(i2.getId());

        InitTest    i3 = new InitTest();
        System.out.println(i3.getId());

        InitTest    i4 = new InitTest();
        System.out.println(i4.getId());

        InitTest    i5 = new InitTest();
        System.out.println(i5.getId());

    }
}
