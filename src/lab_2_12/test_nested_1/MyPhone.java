package lab_2_12.test_nested_1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by olegpoberezhets on 3/18/17.
 */
public class MyPhone {
    public MyPhone() {
        MyPhoneBook1 myPhoneBook1;
    }

    public MyPhoneBook1 switchOn() {
        MyPhoneBook1 myPhoneBook1 = new MyPhoneBook1();
        System.out.print("Loading PhoneBook records...");
        myPhoneBook1.addPhoneNumber("Sasha", "2323423");
        myPhoneBook1.addPhoneNumber("Vasya", "2932123");
        myPhoneBook1.addPhoneNumber("Petya", "1209383");
        myPhoneBook1.addPhoneNumber("Kolya", "6732032");
        myPhoneBook1.addPhoneNumber("Tanya", "1932132");
        myPhoneBook1.addPhoneNumber("Anna", "3938832");
        myPhoneBook1.addPhoneNumber("Dima", "7892132");
        myPhoneBook1.addPhoneNumber("Fedya", "93932132");
        myPhoneBook1.addPhoneNumber("Zina", "3109132");
        myPhoneBook1.addPhoneNumber("Zhora", "4383559");

        System.out.println("OK!");
        System.out.println("Calling to: " + myPhoneBook1.phoneNumbers[1]);
//        myPhoneBook1.printPhoneBookByIndx(1);
        return myPhoneBook1;
    }


    public void call(int indexOfArray) {
        System.out.print("Calling to: ");
    }



    public class MyPhoneBook1 {
        PhoneNumber[] phoneNumbers = new PhoneNumber[10];
        private int i = 0;

        public void addPhoneNumber(String name, String phone) {
            if (i < 10) {
                phoneNumbers[i] = new PhoneNumber(name, phone);
                i++;
            } else {
                System.out.println("Превышен размер телефонной книги. Макс.к-во номеров = 10");
            }
        }

        public void printPhoneBookByIndx(int indx) {
            try {
                System.out.println(phoneNumbers[indx].toString());
            } catch (NullPointerException ex) {
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

        public void printPhoneBook() {
            for (PhoneNumber phoneNumber : phoneNumbers) {
                try {
                    System.out.println(phoneNumber.toString());
                } catch (NullPointerException ex) {
                }
            }
        }
    }

    class PhoneNumber {
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

