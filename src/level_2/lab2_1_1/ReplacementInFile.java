package level_2.lab2_1_1;

import java.io.*;
import java.util.Scanner;

/**
 * Lab Work 1-1-4
 * <p>
 * Write a class called ReplacementInFile whose main(String[] args) method read the source code
 * of any Java-program and replaces all the words public on private.
 * The file name must be entered from the keyboard
 * Created by olegpoberezhets on 4/27/17.
 */
public class ReplacementInFile {
    public static void main(String[] args) throws IOException {
        String wordIn = "public";
        String wordOut = "private";

        String dir = "/Users/olegpoberezhets/IdeaProjects/BrainAcademyLAB/src/level_2/lab2_1_1/dir_for_replacement/";

        Scanner sc = new Scanner(System.in);
        String fileName;

        fileName = "Test1.java";

//        fileName = sc.nextLine();
//        if (!(fileName.endsWith(".java"))) {
//            System.out.println("File has not .java extension! Could you try again.");
//        }
//        System.out.println("Java file: " + fileName)
// ;
        FileReader fr = null;
        FileWriter fwr = null;
        try {
            fr = new FileReader(dir + fileName);
            BufferedReader br = new BufferedReader(fr);
            fwr = new FileWriter(dir + "Test1r.txt");
//            BufferedWriter bwr = new BufferedWriter(fwr);

 while (br.ready()) {
            String str = ((br.readLine().replaceAll("public", "private")));
            System.out.println(str);
            fwr.write(str);
            fwr.append('\n');

        }
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (fwr != null) {
                fwr.close();
            }
        }
    }
}


