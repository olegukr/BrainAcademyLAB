package lab_2_14.test_generics_1;

/**
 * Created by olegpoberezhets on 3/19/17.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple <String, Integer, Long> myTuple1 = new MyTuple<String, Integer, Long>("1", 3, (long)3);
        MyTuple <Double, String, String> myTuple2 = new MyTuple<Double, String, String>(3.4, "23", "gf");
    }
}
