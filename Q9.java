//Q9 Write a program to display times in different country format.

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q9 {
    public static void main(String[] args) {
        Date dt = new Date();

        SimpleDateFormat dtf = new SimpleDateFormat("hh:mm:ss a");
        String s = dtf.format(dt);
        System.out.println("Time format in UK " +s);

        dtf = new SimpleDateFormat("HH:mm:ss");
        s = dtf.format(dt);
        System.out.println("Time format in USA "+s);

        dtf = new SimpleDateFormat("HH.mm.ss");
        s = dtf.format(dt);
        System.out.println("Time format in Finland "+s);

        dtf = new SimpleDateFormat("hh:mm a");
        s = dtf.format(dt);
        System.out.println("Time format in India " +s);
    }
}
//Output:
//        Time format in UK 01:13:44 pm
//        Time format in USA 13:13:44
//        Time format in Finland 13.13.44
//        Time format in India 01:13 pm
