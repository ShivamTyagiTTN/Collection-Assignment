//Q.1 Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        List<Double> li = new ArrayList<>();
        Double sum = 0.0;
        li.add(2.32);
        li.add(4.12);
        li.add(928.212);
        li.add(21.3);
        li.add(5.76);

        Iterator<Double> itr = li.listIterator();

        while (itr.hasNext())
            sum += itr.next();
        System.out.println(sum);
    }
}

//Output: 961.712