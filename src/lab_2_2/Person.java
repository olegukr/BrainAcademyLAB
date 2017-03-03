package lab_2_2;
/**
 *
 * Create class Person with fields firstName(String), lastName(String), age(int), gender(String), phoneNumber(int),
 * and five overloaded methods that set this fields with different arguments list.
 *
 * Create class that will be use instance of class Person and his methods.
 *
 * Created by olegpoberezhets on 02.02.17.
 */
public class Person {

    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

    public void setPerson(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    public void setPerson(String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public void setPerson(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void setPerson(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setPerson(String firstName){
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
