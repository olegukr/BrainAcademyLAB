package lab_2_11.ExceptionDemo;

/**
 * Created by olegpoberezhets on 12.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(140);
        } catch (InvalidAgeException ie) {
            System.out.println("Exception.: Age:" + person.getAge() + ". Please enter an age in range 1-120.");
        }


    }
}
