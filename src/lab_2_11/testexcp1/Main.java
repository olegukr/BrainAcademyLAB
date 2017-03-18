package lab_2_11.testexcp1;

/**
 * Created by olegpoberezhets on 11.03.17.
 */
public class Main {

    public static void main(String[] args) {

//        try {
//            throw new Exception("Something");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            return;
//        } finally {
//            System.out.println("finally");
//        }

        MyTest myTest;
        myTest = null;

        try {
            myTest.test();
        } catch (MyException e) {
            e.printStackTrace();
        }


        try {
            throw new MyException("Something else");
        } catch (MyException ex) {
            System.out.println(ex.toString());
            return;
        } finally {
            System.out.println("finally");
        }


    }
}

