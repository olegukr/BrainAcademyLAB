package lab_2_11.ExceptionDemo;

/**
 * Created by olegpoberezhets on 12.03.17.
 */
public class Person  {
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if( this.age > 120 | this.age < 1) throw new InvalidAgeException();
    }
//    Setter in class Person which will modify age (setAge(int ))
// should throw InvalidAgeException when age out of range 1-120.


}
