package level_2.lab2_1_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * * Lab Work 1-1-2
 * <p>
 * Write a class called PrintFile whose main(String[] args) method reads all the text from the file mentioned
 * on the command-line (args[0]) line-by-line and prints it to standard out.
 * Created by olegpoberezhets on 4/27/17.
 */
public class PrintFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
            }
        } finally {
            bufferedReader.close();
        }
    }
}
