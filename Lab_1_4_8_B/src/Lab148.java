/**
 * Write a console program that prints result type casting
 * for different primitive types.
 * Student should declare and initialize several primitive
 * variables and try to cast to another primitive type variable.
 *
 * Created by olegpoberezhets on 20.01.17.
 */
public class Lab148 {
    public static void main(String[] args) {
        byte b = 8;
        short s = (short) b;
        int i = (int) s;
        long l = (long) i;
        float f = (float) l;
        double d = (double) f;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }

}

