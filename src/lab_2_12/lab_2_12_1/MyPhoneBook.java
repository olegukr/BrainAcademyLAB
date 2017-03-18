package lab_2_12.lab_2_12_1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Create new project called TestNested1. Add package “com.brainacad.oop.testnest1”.
 * Create a class MyPhoneBook which contains static nested class PhoneNumber.
 * 1) Add to class PhoneNumber two fields: name (of String type) and phone (оf String
 * type), constructor with two parameters (name, phone) and getters for each class field.
 * Override the toString() method in PhoneNumber to return information about name and phone number.
 * 2) Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber (array length of 10).
 * 3) Add to class MyPhoneBook public method addPhoneNumber() with two parameters,
 * of String type (name, phone) which use it to create new PhoneNumber object and
 * pass it to next available array element.
 * 4) Add to class MyPhoneBook public method printPhoneBook()
 * which iterates over phoneNumbers array in loop and print name and phone number information of each record to console.
 * 5) Create a class Main with a main() method.
 * Add to method main() code that creates MyPhoneBook object and
 * fill it with five phone number records. Add code to invoke printPhoneBook() method.
 * 6) Execute the program.
 * Example of program output:
 * Name: Sasha, phone: 050123456
 * Name: Vova, phone: 067987654
 * <p>
 * //  Open project TestNested1 from 2-12-1 lab.
 * <p>
 * //  1) Add to class MyPhoneBook two public methods sortByName() and
 * //  sortByPhoneNumber().
 * <p>
 * //  Provide code in sortByName() method
 * // to sort PhoneNumbers array by name
 * // (using Comparator interface and anonymous class).
 * <p>
 * //  Provide code in sortByPhoneNumber () method
 * // to sort PhoneNumbers array by phone
 * // (using Comparator interface and anonymous class).
 * <p>
 * //  2) Add to method main() code that creates MyPhoneBook object
 * // and fill it with ten phone number records.
 * <p>
 * //  3) Add code to sort phone numbers in phone book by invoking sortByName()
 * // and then invoke printPhoneBook() method.
 * //
 * //        Execute the program.
 * //        Example of program output:
 * //        Name: Anna, phone: 0501237777
 * //        Name: Boris, phone: 0679878888
 * //
 * //        public void sortByName(PhoneNumber arr) {
 * //            Arrays.sort(arr, new Comparator(PhoneNumber) {
 * //
 * //                @Override
 * //                public int compare( PhoneNumber phoneNumber1, PhoneNumber phoneNumber2) {
 * //                    return phoneNumber1.getName().compareTo(phoneNumber2.getName());
 * //                }
 * //            });
 * //        }
 * //,
 * Created by olegpoberezhets on 12.03.17.
 */
public class MyPhoneBook {
    private PhoneNumber[] phoneNumbers = new PhoneNumber[10];
    private int i = 0;

    public void addPhoneNumber(String name, String phone) {
        if (i < 10) {
            phoneNumbers[i] = new PhoneNumber(name, phone);
            i++;
        } else {
            System.out.println("Превышен размер телефонной книги. Макс.к-во номеров = 10");
        }
    }

    public void sortByName() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }

    public void sortByPhoneNumber() {
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.phone.compareTo(o2.phone);
            }
        });
    }

//        if (i < 10 ) {
//            try {
//                throw new MyPhoneBookNullPointerException(i + 1);
//            } catch (NullPointerException ex) {
//
//            } catch (MyPhoneBookNullPointerException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("Превышен размер телефонной книги. Макс.к-во номеров = 10");
//        }


    public void printPhoneBook() {
        for (PhoneNumber phoneNumber : phoneNumbers) {
            try {
                System.out.println(phoneNumber.toString());
            } catch (NullPointerException ex) {
            }
        }
    }

    static class PhoneNumber {
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }


//        Example of program output:
//        Name: Sasha, phone: 050123456
//        Name: Vova, phone: 067987654

        @Override
        public String toString() {
            return "Name: " + name + ", phone: " + phone;
        }

    }
}
