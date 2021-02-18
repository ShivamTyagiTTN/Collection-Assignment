//Q.6 Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

import java.util.Map;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        int array[] = {5, 2, 8, 8, 5, 5, 8, 1, 1, 2};
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            if (data.containsKey(array[i])) {
                Integer count = data.get(array[i]) + 1;
                data.put(array[i], count);
            } else {
                data.put(array[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = data.entrySet();

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }
    }
}

//Output:
//        5 -- 3
//        8 -- 3
//        1 -- 2
//        2 -- 2