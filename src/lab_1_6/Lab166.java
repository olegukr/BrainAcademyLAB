package lab_1_6;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;

/**
 * Write a program that sorts an array of average temperature values
 * by months of 2015 as follows: at first the negative values, then - positive values
 * <p>
 * Created by olegpoberezhets on 27.01.17.
 */

public class Lab166 {

    public static void main(String[] args) {
        String[] Months = {"January", "Fabruary", "March", "April", "May", "June", "July",
                "August" , "September" , "October", "November", "December"};
        String[] Temp = {"-9", "-8", "0", "6", "17", "19", "22", "20", "15", "7", "-3", "-6"};
        String[][] avrgTempByMonths = new String[12][2];
        for (int i = 0; i < avrgTempByMonths.length; i++) {
            avrgTempByMonths[i][0] = Months[i];
            avrgTempByMonths[i][1] = Temp[i];
            System.out.println(avrgTempByMonths[i][0] + ": " + avrgTempByMonths[i][1]);
        }
        System.out.println();

        String tempMonth;
        String tempTemp;
        for (int k=0; k < avrgTempByMonths.length; k++) {

            for (int i = avrgTempByMonths.length - 1; i > k; i--) {

                if (Integer.valueOf(avrgTempByMonths[i-1][1]) > Integer.valueOf(avrgTempByMonths[i][1])) {
                    tempMonth = avrgTempByMonths[i-1][0];
                    tempTemp = avrgTempByMonths[i-1][1];
                    avrgTempByMonths[i-1][0] = avrgTempByMonths[i][0];
                    avrgTempByMonths[i-1][1] = avrgTempByMonths[i][1];
                    avrgTempByMonths[i][0] = tempMonth;
                    avrgTempByMonths[i][1] = tempTemp;
                }
            }
        }
        for (int i = 0; i < avrgTempByMonths.length; i++) {
            System.out.println(avrgTempByMonths[i][0] + ": " + avrgTempByMonths[i][1]);
        }
    }
}
