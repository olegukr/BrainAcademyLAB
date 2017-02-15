/**
 * Write class InitTest with private field id of int type and static private field nextId of integer.
 * Write code that:
 * Initialize static field nextId of some random value (in 1 … 1000 range) once
 * when class loaded to JVM;
 * Increments static field nextId each time when new instance of InitTest created;
 * Initialize field id of nextId field value each time when new instance of InitTest created.
 * And method getId() which will return value of id.
 * Create class Main, which will create five instances of class InitTest and invokes method getId()
 * on each instance and print returned value on console.
 * <p>
 * Created by
 * <p>
 * Created by olegpoberezhets on 10.02.17.
 */

// import java.util.Random;

public class InitTest {
    private int id;
    private static int nextId;

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    static {
        nextId = (int) (Math.random() * 1000);
        if (nextId < 1) {
            nextId = nextId + 1;
        }
    }

    public void InitTest() {
        nextId++;
        id = nextId;
    }

}
