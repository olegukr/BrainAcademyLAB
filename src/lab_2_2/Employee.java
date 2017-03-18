package lab_2_2;

/**
 *
 * Write class Employee with method calcSalary with argument name(String) and varargs salary(double…).
 * This method should calculate total salary of employee and print his name and total salary.
 *
 * Write class Accountant that will be create Employee instance and use his method with a different number of data.
 *
 * Created by olegpoberezhets on 29.01.17.
 */
public class Employee {


    public double calcSalary(String name, double... salaries) {

        double totalSalary = 0;
        for (int i = 0; i < salaries.length; i++) totalSalary = totalSalary + salaries[i];
        System.out.println("Total salary of " + name + ": " + totalSalary);
        return totalSalary;
    }

}
