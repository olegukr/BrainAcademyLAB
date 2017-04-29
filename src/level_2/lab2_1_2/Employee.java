package level_2.lab2_1_2;

import java.awt.*;
import java.io.Serializable;

/**
 * Created by olegpoberezhets on 4/23/17.
 */
public class Employee implements Serializable {
    String name;
    String address;
    transient int  SSN;
    int number;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
