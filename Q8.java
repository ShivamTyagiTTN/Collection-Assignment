//Q.8 Write a program to format date as example "21-March-2016"

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q8 {
    public static void main(String[] args) {
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");

        String s = sdf.format(dt);
        System.out.println(s);
    }
}

//Output:
//        18-February-2021
