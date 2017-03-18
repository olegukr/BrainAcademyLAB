package lab_2_12.lab_2_12_1;

import lab_2_11.testexcp1.MyException;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by olegpoberezhets on 12.03.17.
 */
public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Sasha", "2323423");
        myPhoneBook.addPhoneNumber("Vasya", "2932123");
        myPhoneBook.addPhoneNumber("Petya", "1209383");
        myPhoneBook.addPhoneNumber("Kolya", "6732032");
        myPhoneBook.addPhoneNumber("Tanya", "1932132");

//        myPhoneBook.printPhoneBook();

        myPhoneBook.addPhoneNumber("Anna", "3938832");
        myPhoneBook.addPhoneNumber("Dima", "7892132");
        myPhoneBook.addPhoneNumber("Fedya", "93932132");
        myPhoneBook.addPhoneNumber("Zina", "3109132");
        myPhoneBook.addPhoneNumber("Zhora", "4383559");
//        myPhoneBook.addPhoneNumber("Sonya", "4383559");

        myPhoneBook.printPhoneBook();
        System.out.println("-----");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();
        System.out.println("-----");
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();
    }
}

