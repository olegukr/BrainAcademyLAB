package level_2.lab2_1_1;

import java.io.File;
import java.nio.file.Files;

/**
 * Lab Work 1-1-1
 * <p>
 * Write a class called MyFilesList whose main(String[] args) method prints to standard out the files/directories contained in
 * 1. the current directory if no args[0] specified, or,
 * 2. the directory mentioned in args[0].
 * Don't worry about formatting the output; just print one file or directory name per output line.
 * Created by olegpoberezhets on 4/27/17.
 */
public class MyFilesList {
    public static void main(String[] args) {

        for (int i1 = 0; i1 < args.length; i1++) {
            File file = new File(args[i1]);
            if (file.isFile()) {
                System.out.println("file for args[" + i1 + "]: " + args[i1] + " :" + file.getName());
            } else if (file.isDirectory()) {
                for (int i = 0; i < file.list().length; i++) {
                    System.out.println("file in directory for args[" + i1 + "]: " + args[i1] + ": " + file.list()[i].toString());
                }
            }
        }
    }
}
