package lab_2_4;

/**
 * 1) Create Employee class with fields firstName, lastName, occupation, telephone and static field numberOfEmployees and getters/setters.
 * 2) Class must have constructor, which will initialize class fields and increment numberOfEmployees.
 * 3) Create multiple instances of Employee class and the output numberOfEmployees field to the console.
 *
 * Created by olegpoberezhets on 05.02.17.
 */
public class Lab244 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        System.out.printf("Number of Employees: " + Employee.numberOfEmployees);
    }
}
