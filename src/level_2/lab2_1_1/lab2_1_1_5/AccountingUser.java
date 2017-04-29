package level_2.lab2_1_1.lab2_1_1_5;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Write a program that saves user name and the number of his visits to the company website in the file:
 * 1) Create with field a file (type RandomAccessFile), which is associated with the file
 * "users.txt", containing the user's name and the number of his visits to the company's
 * website in the format: "nameUser:number". For example,
 * Sidorov:2
 * Govga:1
 * Danilina:3
 * ........
 * 2) Add in AccountingUser class the testUsers(String name User) method, which adds a
 * new user to end the file, while the existing - increases the number of visits;
 * 3) Add in AccountingUser class the printFile() method, which prints the contents of the
 * file "users.txt";
 * 4) Add in AccountingUser class override finalize() method to close the file "users.txt";
 * 5) Create a class Main with a main() method, which creates a scanner for entering a
 * user name, visit the company website, and then tests it on a previous visit.
 * Created by olegpoberezhets on 4/29/17.
 */
public class AccountingUser {
    String dir = "/Users/olegpoberezhets/IdeaProjects/BrainAcademyLAB/src/level_2/lab2_1_1/lab2_1_1_5/";
    RandomAccessFile file = new RandomAccessFile(dir +"users.txt", "rw");

    public AccountingUser() throws FileNotFoundException {
    }

    public void testUsers(String nameUser) {

    }

    public void printFile() {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
