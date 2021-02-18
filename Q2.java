//Q.2 Write a method that takes a string and returns the number of unique characters in the string.

import java.util.HashMap;

class counter {
    public static int countUnique(String str) {
        char[] arr = str.toCharArray();
        int count =0;

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : arr) {
            if (hm.containsKey(c))
                hm.put(c, hm.get(c) + 1);
            else
                hm.put(c, 1);
        }

        for (char c : arr) {
            if (hm.get(c) == 1)
                count++;
        }
        return count;
    }
}

public class Q2
{
    public static void main(String[] args) {

        String str="aabcde ";
        System.out.println(counter.countUnique(str));
    }
}

//Output: 5