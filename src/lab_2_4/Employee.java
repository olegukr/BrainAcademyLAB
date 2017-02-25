/**
 * 2.4.4:
 * 1) Create Employee class with fields firstName, lastName, occupation, telephone
 *  and static field numberOfEmployees and getters/setters.
 *
 * 2) Class must have constructor, which will initialize class fields and increment numberOfEmployees.
 *
 * 3) Create multiple instances of Employee class and the output numberOfEmployees field to the console.
 *
 * Created by olegpoberezhets on 05.02.17.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;
    static int numberOfEmployees;

    public Employee() {
        numberOfEmployees++;
    }

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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }
}
