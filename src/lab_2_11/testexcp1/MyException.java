package lab_2_11.testexcp1;

/**
 * Created by olegpoberezhets on 11.03.17.
 */
public class MyException extends Exception {
    String str;
    public MyException( String s){
        str = s;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "str='" + str + '\'' +
                '}';
    }
}
