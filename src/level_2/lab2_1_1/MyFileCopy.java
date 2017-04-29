package level_2.lab2_1_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Lab Work 1-1-3
 * <p>
 * Write a class called MyFileCopy whose main(String[] args)
 * method copies one file (could be binary!) to another (args[0] to args[1]).
 * Created by olegpoberezhets on 4/27/17.
 */
public class MyFileCopy {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);
        int c;
        try {
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
        } finally {
            if (fis != null) fis.close();
            if (fos != null) fos.close();
        }
    }
}
