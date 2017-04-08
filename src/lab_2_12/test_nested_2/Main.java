package lab_2_12.test_nested_2;

/**
 * Created by olegpoberezhets on 3/18/17.
 */
public class Main {
    public static void main(String[] args) {
        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        MyTestClass myTestClass =  new MyTestClass();
        MyTestClass.MyInner myInner = myTestClass.new MyInner();
    }
}
