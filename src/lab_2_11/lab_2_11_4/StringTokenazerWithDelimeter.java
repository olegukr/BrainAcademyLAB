package lab_2_11.lab_2_11_4;

import java.util.StringTokenizer;

/**
 * Created by olegpoberezhets on 10.03.17.
 */
public class StringTokenazerWithDelimeter {
    public String parseString(String s, String t) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, t);
        String sout = null;
        while (stringTokenizer.hasMoreElements()) sout = sout + stringTokenizer.nextElement() + ", ";
        return sout;
    }
}
